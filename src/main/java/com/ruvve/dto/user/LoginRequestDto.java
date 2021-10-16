package com.ruvve.dto.user;

import lombok.Getter;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Getter
public class LoginRequestDto {

    private String email;
    private String nickname;
    private String password;

//    public UsernamePasswordAuthenticationToken createUsernamePasswordAuthenticationToken() {
//        return new UsernamePasswordAuthenticationToken(this.email, this.password);
//    }
}