package com.globallogic.java_patterns.flyweight;


import java.util.HashMap;

public class BookFactory {

    private static final HashMap<String, Book> books = new HashMap<>();

    public static Book getBook(String title) {
        if(books.containsKey(title)) {
            return books.get(title);
        }

        Book book = new Book();
        book.setTitle(title);

        books.put(title, book);

        return book;
    }
}
