/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.springboot2.model;
public class StudentModel {
    private int id;
    private long age;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
