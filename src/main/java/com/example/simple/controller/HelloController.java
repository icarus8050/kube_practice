package com.example.simple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${my.name}")
    private String name;

    @Value("${aaa.bbb}")
    private String value;

    @GetMapping("/")
    public String root() {
        return value;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello " + name;
    }
}
