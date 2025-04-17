package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication extends SpringBootServletInitializer {
    
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }
}
