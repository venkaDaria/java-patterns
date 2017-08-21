package com.globallogic.java_patterns.prototype;

public abstract class Shape implements Copyable {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public abstract void draw();
}

