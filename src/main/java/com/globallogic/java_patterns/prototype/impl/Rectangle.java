package com.globallogic.java_patterns.prototype.impl;

import com.globallogic.java_patterns.prototype.Shape;
import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;

public class Rectangle extends Shape {

    @Override
    public Rectangle copy() throws CopyNotSupportedException {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(getColor());
        return rectangle;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing %s rectangle", getColor()));
    }
}
