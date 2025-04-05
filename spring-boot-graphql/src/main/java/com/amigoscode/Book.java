package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount,Integer authorId) {

    public static List<Book> books= Arrays.asList(
            new Book(1,"demo",100,1),
            new Book(2,"demo2",200,2),
            new Book(3,"demo3",300,3),
            new Book(4,"demo4",400,4)
    );

    public static Book getBookById(Integer id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst()
                .orElse(null);
    }
}
