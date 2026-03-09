package com.microservice2.controller;

import com.microservice2.client.WelcomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ms2")
public class MicroService2Controller {
    @Autowired
    private WelcomeClient welcomeClient;

    //http://localhost:8082/api/ms2/call

    @GetMapping("/call")
    public String getMessageFromMicroService1(){
        return welcomeClient.getMessage() + " " + welcomeClient.postHello("we are Learning microservices") ;
    }
}
