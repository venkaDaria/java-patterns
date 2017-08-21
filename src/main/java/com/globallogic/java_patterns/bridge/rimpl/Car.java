package com.globallogic.java_patterns.bridge.rimpl;

import com.globallogic.java_patterns.bridge.Movable;

public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Go by car");
    }
}
