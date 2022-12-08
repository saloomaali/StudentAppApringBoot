package com.example.studemtAppNew_Backend.controller;

import com.example.studemtAppNew_Backend.dao.StudentDao;
import com.example.studemtAppNew_Backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddStudent(@RequestBody Students s){
        dao.save(s);

        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Students> viewStudent(){


        return (List<Students>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Students> searchStudent(@RequestBody Students s){

        return dao.searchStudent(s.getAdmnNo());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deleteStudent(@RequestBody Students s){
        dao.deleteStudent(s.getId());

        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

}
