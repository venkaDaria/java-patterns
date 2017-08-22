package com.globallogic.java_patterns.observer.model;

public class Animal {
    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

