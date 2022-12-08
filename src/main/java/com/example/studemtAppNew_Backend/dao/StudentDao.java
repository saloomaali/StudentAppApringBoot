package com.example.studemtAppNew_Backend.dao;

import com.example.studemtAppNew_Backend.model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentDao extends CrudRepository <Students,Integer>{

    @Query(value = "SELECT `id`, `admn_no`, `college`, `name`, `roll_no` FROM `students` WHERE `admn_no` = :admn_no", nativeQuery = true)
    List<Students> searchStudent(@Param("admn_no") String admn_no);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `students` WHERE `id` = :id", nativeQuery = true)
    void deleteStudent(@Param("id") Integer id);
}
