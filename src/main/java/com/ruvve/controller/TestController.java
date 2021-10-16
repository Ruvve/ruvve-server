package com.ruvve.controller;

import com.ruvve.core.rest.DefaultResponse;
import com.ruvve.utils.ResponseMessage;
import com.ruvve.utils.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    /**
     * Test API
     */
    @GetMapping("/test")
    public ResponseEntity test() {
        DefaultResponse<String> dto = new DefaultResponse(StatusCode.OK, ResponseMessage.TEST);
        log.info("TEST API");
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
