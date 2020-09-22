/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.CompletionStage;

import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Using CompletionStage/CompletableFuture books grading fill into the corresponding book list.Finally, the populated Book list is printed.
 */
public class BookMain {
    public static void main(String[] args) {
        CompletionStage<List<Book>> completableFuture = BookList.getBookList().thenApply(list -> {
            for (Book book : list) {
                BookList.getBookScoreById(book.getId()).thenAccept(score -> book.setScore(score));
            }
            System.out.println(list);
            return list;
        });
    }

}
