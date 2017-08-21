package com.globallogic.java_patterns.decorator.dimpl;

import com.globallogic.java_patterns.decorator.Shape;
import com.globallogic.java_patterns.decorator.ShapeDecorator;

public class DottedDecorator extends ShapeDecorator {

    public DottedDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        drawDottedBorder(decoratedShape);
    }

    private void drawDottedBorder(Shape decoratedShape) {
        System.out.println("dotted border");
    }
}
