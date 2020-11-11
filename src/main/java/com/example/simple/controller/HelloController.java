package com.example.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "root path";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
