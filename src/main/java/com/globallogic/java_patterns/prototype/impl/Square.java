package com.globallogic.java_patterns.prototype.impl;

import com.globallogic.java_patterns.prototype.Shape;
import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;

public class Square extends Shape {

    @Override
    public Square copy() throws CopyNotSupportedException {
        Square square = new Square();
        square.setColor(getColor());
        return square;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing %s square", getColor()));
    }
}
