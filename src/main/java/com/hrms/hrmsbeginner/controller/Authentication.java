package com.hrms.hrmsbeginner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class Authentication {
    @GetMapping
    public String hello() {
        return "hi";
    }
}
