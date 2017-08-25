package com.globallogic.java_patterns.flyweight.impl;

import com.globallogic.java_patterns.flyweight.Book;

public class Story extends Book {

    @Override
    public void read() {
        System.out.println("Reading a short story");
    }
}
