package com.globallogic.java_patterns.composite.impl;

import com.globallogic.java_patterns.composite.Storable;

public class Toy implements Storable {

    private String name;

    public Toy(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Toy " + name;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
