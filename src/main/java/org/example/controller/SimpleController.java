package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class SimpleController {
    @GetMapping
    public String getResponse() {
        System.out.println("----> HANDLE HTTP REQUEST USING CONTROLLER");
        return "GET RESPONSE FROM CONTROLLER";
    }
}
