/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
        //1.Find artists whoes name start with A.
        System.out.println("Find artists whoes name start with A:");
        Predicate<Artist> a = Artist->Artist.getName().startsWith("A");
        stream.filter(a).forEach(Artist-> System.out.println(Artist));
        //2. Get all ages from artists
        System.out.println("Get all ages from artists:");
        Stream<Integer> ages = artist.stream().map(Artist -> Artist.getAge());
        ages.forEach(Artist -> System.out.println(Artist));
        //3. Get first two ages from artists
        System.out.println("First two ages: ");
        artist.stream()
                .map(Artist::getAge)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //4. Sort the artist list by age in desc.
        artist.stream()
                .sorted(Comparator.comparing(Artist::getAge).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //5. Print artists' name
        System.out.println("All names: ");
        artist.stream()
                .map(Artist::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //6. Get all even number ages from artists
        System.out.println("All even number ages: ");
        artist.stream()
                .filter(Artist -> Artist.getAge()%2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
