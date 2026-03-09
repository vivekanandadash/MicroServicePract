package com.microservice1.microservice1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {
    @GetMapping("/message")
    public String getMessage(){
        return "welcome";
    }
    @PostMapping("/hello")
    public String postHello(
            @RequestParam String x
    ){
        return x;
    }
}