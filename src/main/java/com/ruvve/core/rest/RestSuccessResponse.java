package com.ruvve.core.rest;

import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public class RestSuccessResponse<T> extends RestResponse {
    @Nullable
    private T data;

    @Builder
    public RestSuccessResponse(int code, String responseMessage) {
        this.status= code;
        this.message = responseMessage;
        this.data = data;
    }

    @Builder
    public RestSuccessResponse(int code, String responseMessage, T data) {
        this.status= code;
        this.message = responseMessage;
        this.data = data;
    }
}
