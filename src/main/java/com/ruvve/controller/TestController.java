package com.ruvve.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruvve.model.DefaultDTO;
import com.ruvve.utils.ResponseMessage;
import com.ruvve.utils.StatusCode;
//import lombok.extern;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Log4j2
@Slf4j
@RestController
public class TestController {

    /**
     * Test API
     */
    @GetMapping("/test")
    public ResponseEntity test() {
        DefaultDTO dto = new DefaultDTO(StatusCode.OK, ResponseMessage.TEST);
        log.info("TEST API");
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
