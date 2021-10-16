package com.ruvve.service;

import com.ruvve.core.rest.DefaultResponse;
import com.ruvve.domain.User;
import com.ruvve.dto.user.LoginRequestDto;
import com.ruvve.dto.user.LoginResponseDto;
import com.ruvve.mapper.UserMapper;
import com.ruvve.utils.JwtProvider;
import com.ruvve.utils.ResponseMessage;
import com.ruvve.utils.StatusCode;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Log4j
@Service
public class UserService {
    private final UserMapper userMapper;

    private PasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Value("${salt}") String secret;
    public DefaultResponse saveUser(LoginRequestDto loginRequestDto) {
        try {
            String password = passwordEncoder.encode(loginRequestDto.getPassword());
            User user = new User(loginRequestDto.getEmail(), password, loginRequestDto.getNickname());

            userMapper.saveUser(user);
            return new DefaultResponse<>(StatusCode.OK, ResponseMessage.LOGIN_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new DefaultResponse<>(StatusCode.SERVICE_UNAVAILABLE, ResponseMessage.FAIL_CREATE_USER);
        }
    }

    public DefaultResponse checkUser(LoginRequestDto loginRequestDto) {
        final User user = userMapper.getUser(loginRequestDto.getEmail());

        if (user == null) {
            return new DefaultResponse<>(StatusCode.SERVICE_UNAVAILABLE, ResponseMessage.FAIL_CREATE_USER);
        }

        JwtProvider jwtProvider = new JwtProvider();
        String token = jwtProvider.createToken(Integer.toString(user.getUserId()), Arrays.asList(user.getEmail(), user.getNickname()));
        LoginResponseDto loginResponseDto = new LoginResponseDto(token);

        return new DefaultResponse<>(StatusCode.OK, ResponseMessage.LOGIN_SUCCESS, loginResponseDto);
    }
}
