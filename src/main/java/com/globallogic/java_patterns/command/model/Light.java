package com.globallogic.java_patterns.command.model;

public class Light {

    private boolean isLight;

    public void turnOff() {
        setLight(false);
        System.out.println("Light off");
    }

    public void turnOn() {
        setLight(true);
        System.out.println("Light on");
    }

    public boolean isLight() {
        return isLight;
    }

    public void setLight(final boolean light) {
        isLight = light;
    }
}
