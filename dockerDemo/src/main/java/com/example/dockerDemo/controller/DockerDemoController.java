package com.example.dockerDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerDemoController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from the Docker demo application!";
    }
}
