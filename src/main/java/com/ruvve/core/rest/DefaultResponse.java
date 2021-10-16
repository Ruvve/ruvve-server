package com.ruvve.core.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DefaultResponse<T> {

    private final int statusCode;
    private final String message;
    private T data;

    public DefaultResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}