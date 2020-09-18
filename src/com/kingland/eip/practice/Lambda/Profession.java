/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.Lambda;

/**
 * Profession is a enumeration class, which contains two values: Pinter and Singer.
 */
public enum Profession {
    Painter("Painter"),
    Singer("Singer");
    private String profession;

    Profession(String profession) {
        this.profession = profession;
    }
}
