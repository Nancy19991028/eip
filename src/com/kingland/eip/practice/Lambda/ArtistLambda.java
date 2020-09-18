/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Using Lambda expression to solve task.
 */
public class ArtistLambda {
    public static void main(String[] args) {
        List<Artist> artist = new ArrayList();
        artist.add(new Artist(10, "Alan", Profession.Singer));
        artist.add(new Artist(45, "Alice", Profession.Painter));
        artist.add(new Artist(63, "Mike", Profession.Singer));
        artist.add(new Artist(30, "Helen", Profession.Painter));

        Stream<Artist> stream = artist.stream();
        System.out.println("Find artists whoes name start with A:");
        //1.Find artists whoes name start with A.
        Predicate<Artist> a = Artist->Artist.getName().startsWith("A");
        stream.filter(a).forEach(Artist-> System.out.println(Artist));
        System.out.println("Get all ages from artists:");
        //2. Get all ages from artists
        Stream<Integer> ages = artist.stream().map(Artist -> Artist.getAge());
        ages.forEach(Artist -> System.out.println(Artist));

    }

}
