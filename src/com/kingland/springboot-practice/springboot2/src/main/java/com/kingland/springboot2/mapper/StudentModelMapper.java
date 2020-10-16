/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.springboot2.mapper;

import com.kingland.springboot2.model.StudentModel;

import java.util.List;

public interface StudentModelMapper {
    List<StudentModel> getAllStudents();
    int deleteStudent(int id);
}
