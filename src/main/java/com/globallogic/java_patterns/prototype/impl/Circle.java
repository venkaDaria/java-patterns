package com.globallogic.java_patterns.prototype.impl;

import com.globallogic.java_patterns.prototype.Shape;
import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;

public class Circle extends Shape {

    @Override
    public Circle copy() throws CopyNotSupportedException {
        Circle circle = new Circle();
        circle.setColor(getColor());
        return circle;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing %s circle", getColor()));
    }
}
