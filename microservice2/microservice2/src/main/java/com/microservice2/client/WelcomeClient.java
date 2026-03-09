package com.microservice2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="MS1" ,url = "http://localhost:8081")
public interface WelcomeClient {
    @GetMapping("/api/v1/message")
    public String getMessage();

    @PostMapping("/api/v1/hello")
    public String postHello(@RequestParam String x);
}
