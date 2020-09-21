package com.kingland.eip.practice.CompletionStage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class BookList {

    public static CompletionStage<List<Book>> getAllBook(){
        return CompletableFuture.supplyAsync(() -> {
            List<Book> bookList = new ArrayList<>();
        Book a = new Book(1L, "abc", null);
        Book b = new Book(2L, "abcd", null);
        Book c = new Book(3L, "abcde", null);
        Book d = new Book(4L, "abcdef", null);
        Book e = new Book(5L, "abcdefg", null);
        Book f = new Book(6L, "abcdefgh", null);
        Book g = new Book(7L, "abcdefghi", null);
        Book h = new Book(8L, "abcdefghij", null);
        Book i = new Book(9L, "abcdefghijk", null);
        Book j = new Book(10L, "abcdefghijkl", null);


            bookList.add(a);
            bookList.add(b);
            bookList.add(c);
            bookList.add(d);
            bookList.add(e);
            bookList.add(f);
            bookList.add(g);
            bookList.add(h);
            bookList.add(i);
            bookList.add(j);
        }
    }
}
