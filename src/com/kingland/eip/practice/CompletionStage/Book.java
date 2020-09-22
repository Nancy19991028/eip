/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.CompletionStage;

/**
 * Defines the Book entity class Book (field id, name, score)
 */
public class Book {
    private Long id;
    private String name;
    private Double score;

    public Book(Long id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';

    }
}
