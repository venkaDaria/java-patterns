package com.globallogic.java_patterns.decorator.dimpl;

import com.globallogic.java_patterns.decorator.Shape;
import com.globallogic.java_patterns.decorator.ShapeDecorator;

public class BlueDecorator extends ShapeDecorator {

    public BlueDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        drawBlueBorder(decoratedShape);
    }

    private void drawBlueBorder(Shape decoratedShape) {
        System.out.println("blue border");
    }
}
