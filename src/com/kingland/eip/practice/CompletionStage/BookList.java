/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.CompletionStage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class BookList {
    /**
     * Call an API to get a list of books with the return value
     * @return ComplationStage&lt;List&lt;Book&gt;&gt;
     */
    public static CompletionStage<List<Book>> getBookList() {
        return CompletableFuture.supplyAsync(() -> {
            List<Book> BookList = new ArrayList<>();
            BookList.add(new Book(1L, "abc", null));
            BookList.add(new Book(2L, "abcd", null));
            BookList.add(new Book(3L, "abcde", null));
            BookList.add(new Book(4L, "abcdef", null));
            BookList.add(new Book(5L, "abcdefg", null));
            BookList.add(new Book(6L, "abcdefgh", null));
            BookList.add(new Book(7L, "abcdefghi", null));
            BookList.add(new Book(8L, "abcdefghij", null));
            BookList.add(new Book(9L, "abcdefghijk", null));
            BookList.add(new Book(10L, "abcdefghijkl", null));
            return BookList;
        });
    }

    /**
     * Call another API to get the score of the book with the id of the book and the return value , the API passes in a bookId and returns the score for the current book
     * @param bookId
     * @return CompletionStage&lt;Double&gt;
     */
    public static CompletionStage<Double> getBookScoreById(Long bookId) {
        Map<Long, Double> bookscore = new HashMap<>();
        bookscore.put(1L, 7.1);
        bookscore.put(2L, 7.2);
        bookscore.put(3L, 7.3);
        bookscore.put(4L, 7.4);
        bookscore.put(5L, 7.5);
        bookscore.put(6L, 7.6);
        bookscore.put(7L, 7.7);
        bookscore.put(8L, 7.8);
        bookscore.put(9L, 7.9);
        bookscore.put(10L, 8.0);
        return CompletableFuture.supplyAsync(() -> bookscore.get(bookId));

    }

}

