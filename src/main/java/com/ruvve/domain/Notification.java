package com.ruvve.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Notification {
    private int notificationId;
    private String deviceToken;
    private int env;

    @Builder
    public Notification(String deviceToken, int env) {
        this.deviceToken = deviceToken;
        this.env = env;
    }
}