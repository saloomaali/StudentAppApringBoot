package com.example.studemtAppNew_Backend.controller;

import com.example.studemtAppNew_Backend.model.Students;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        return "student added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public String viewStudent(@RequestBody Students s){
        return "";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search")
    public String searchStudent(){
        return "";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete")
    public String deleteStudent(){
        return "";
    }

}
