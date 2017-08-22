package com.globallogic.java_patterns.command.model;

public class TV extends Light {

    @Override
    public void turnOff() {
        setLight(false);
        System.out.println("TV off");
    }

    @Override
    public void turnOn() {
        setLight(true);
        System.out.println("TV on");
    }
}
