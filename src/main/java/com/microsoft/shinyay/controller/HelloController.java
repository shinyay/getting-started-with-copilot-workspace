package com.microsoft.shinyay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, the current time is " + LocalDateTime.now();
    }
}
