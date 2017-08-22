package com.globallogic.java_patterns.iterator.impl;

public class Book {

    private String title;

    public Book(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }
}
