package com.globallogic.java_patterns.flyweight.impl;

import com.globallogic.java_patterns.flyweight.Book;

public class Roman extends Book {

    private int bookmark;

    public void read(final int count) {
        bookmark += count;
        System.out.println("Reading a page: " + bookmark);
    }

    @Override
    public void read() {
        read(1);
    }
}
