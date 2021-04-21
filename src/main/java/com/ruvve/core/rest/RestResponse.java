package com.ruvve.core.rest;

import lombok.Getter;

@Getter
public abstract class RestResponse {
    int status;
    String message;
}