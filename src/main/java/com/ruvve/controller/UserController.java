package com.ruvve.controller;

import com.ruvve.core.rest.DefaultResponse;
import com.ruvve.dto.user.LoginRequestDto;
import com.ruvve.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public DefaultResponse register(@RequestBody LoginRequestDto loginRequestDto) {
        return userService.saveUser(loginRequestDto);
    }

    @PostMapping("/login")
    public DefaultResponse login(@RequestBody LoginRequestDto loginRequestDto) {
        return userService.checkUser(loginRequestDto);
    }
}
