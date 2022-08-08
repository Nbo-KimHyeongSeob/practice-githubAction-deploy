package com.example.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "We are pair 47!";
    }
    @GetMapping("/new")
    public String start(){
        return "New !!";
    }

}
