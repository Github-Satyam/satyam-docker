package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {


        @RequestMapping
        public String helloWorld(){
            return "Hello World from Satyam Spring Boot Docker Image";
        }

        @GetMapping("/{name}")
        public String welcomeMessage(@PathVariable("name") String name) {
            return name + "Welcome to  Satyam SpringBoot Project";
        }
    }


