package com.kingland.eip.practice.CompletionStage;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class BookMain {
    public static <ComparableFuture> void main(String[] args) throws ExecutionException,InterruptedException{
        Supplier<List<Book>> task = ()->getBookList();
        ComparableFuture<List<Book>> comparableFuture = CompletableFuture.supplyAsync(task)
                .thenApply(list ->{
            for(Book book : list){
                book.setScore(getScore(book.getId()));
            }
            return list;
        }

    }

}
