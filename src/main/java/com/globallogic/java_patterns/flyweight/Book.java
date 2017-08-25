package com.globallogic.java_patterns.flyweight;

public abstract class Book {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public abstract void read();
}
