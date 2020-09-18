/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.Lambda;

/**
 * Create a class name Artist.
 *
 * Property: age, name, profession.
 *
 */
public class Artist {
    private int age;
    private String name;
    private Profession profession;
    public Artist(int age,String name,Profession profession){
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession=" + profession +
                '}';
    }

}
