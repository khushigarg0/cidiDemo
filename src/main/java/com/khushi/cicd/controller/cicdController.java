package com.khushi.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class cicdController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world!";
    }
}
