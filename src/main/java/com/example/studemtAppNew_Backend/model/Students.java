package com.example.studemtAppNew_Backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String admnNo;
    private int rollNo;
    private String college;

    public Students() {
    }

    public Students(int id, String name, String admnNo, int rollNo, String college) {
        this.id = id;
        this.name = name;
        this.admnNo = admnNo;
        this.rollNo = rollNo;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(String admnNo) {
        this.admnNo = admnNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
