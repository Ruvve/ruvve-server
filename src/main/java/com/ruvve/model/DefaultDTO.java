package com.ruvve.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
public class DefaultDTO<T> {
    private int status;
    private String message;

    @Nullable
    private T data;

    @Builder
    public DefaultDTO(final int code, final String responseMessage) {
        this.status= code;
        this.message = responseMessage;
    }

}