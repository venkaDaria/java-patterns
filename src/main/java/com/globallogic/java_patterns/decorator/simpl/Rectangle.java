package com.globallogic.java_patterns.decorator.simpl;

import com.globallogic.java_patterns.decorator.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
