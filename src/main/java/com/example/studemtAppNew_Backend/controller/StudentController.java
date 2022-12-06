package com.example.studemtAppNew_Backend.controller;

import com.example.studemtAppNew_Backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to my website";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        return "student added successfully";
    }
}
