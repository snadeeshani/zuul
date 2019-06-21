package com.virtusa.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class sampleController {

    @GetMapping("/hello")
    public  String sayHello()
    {
        return "Hi,Welcome to Service1";

    }
    @GetMapping("/admin")
    public  String sayHelloAdmin() {
        return "Hi,Welcome to Service1 ADMIN ";

    }
}
