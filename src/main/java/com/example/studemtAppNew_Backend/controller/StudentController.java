package com.example.studemtAppNew_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "welcome to my contact page";
    }
    @GetMapping("/gallery")
    public String gallery(){
        return "welcome to the gallery";
    }
}
