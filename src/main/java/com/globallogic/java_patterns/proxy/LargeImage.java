package com.globallogic.java_patterns.proxy;

public class LargeImage implements Image {

    private String name;

    public LargeImage() {
    }

    private LargeImage(final String name) {
        this.name = name;
    }

    @Override
    public Image get(final String name) {
        System.out.println("some expensive operation for loading image");
        return new LargeImage(name);
    }

    @Override
    public String toString() {
        return String.format("image with name \"%s\"", name);
    }
}
