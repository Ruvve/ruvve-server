package com.ruvve.core.rest;

import lombok.Getter;

@Getter
public class RestFailResponse extends RestResponse {

    public RestFailResponse(int code, String responseMessage) {
        this.status= code;
        this.message = responseMessage;
    }
}
