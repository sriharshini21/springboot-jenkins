package com.example.springboot_jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class Jenkinscontroller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Jenkins! This is a Spring Boot App!";
    }
}
