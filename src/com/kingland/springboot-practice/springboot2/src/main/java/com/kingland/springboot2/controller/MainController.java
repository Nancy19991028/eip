/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.springboot2.controller;

import com.kingland.springboot2.mapper.StudentModelMapper;
import com.kingland.springboot2.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    private final StudentModelMapper mapper;

    public MainController(StudentModelMapper mapper) {
        this.mapper = mapper;
    }

    @Cacheable(cacheNames = "student")
    @GetMapping("/student")
    public List<StudentModel> hello(){
        System.out.println(mapper.getAllStudents());
        return mapper.getAllStudents();
    }
    @CacheEvict(cacheNames = "student")
    public void delete(){

    }

    @CacheEvict(cacheNames = "student" ,key = "#id")
    @DeleteMapping("/delete")
    public int delete(int id){
       int changeRow = mapper.deleteStudent(id);
        System.out.println(changeRow);
        hello();
        return changeRow;
    }
}
