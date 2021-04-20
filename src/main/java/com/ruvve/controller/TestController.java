package com.ruvve.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/test")
    public @ResponseBody String test() {
        logger.info("테스트 잘 됨 ?");
        return "SPRING DEMO TEST";
    }
}
