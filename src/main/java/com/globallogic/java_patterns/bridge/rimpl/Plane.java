package com.globallogic.java_patterns.bridge.rimpl;

import com.globallogic.java_patterns.bridge.Movable;

public class Plane implements Movable {

    @Override
    public void move() {
        System.out.println("Go by plane");
    }
}
