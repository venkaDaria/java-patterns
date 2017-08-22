package com.globallogic.java_patterns.decorator;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.decorator.dimpl.BlueDecorator;
import com.globallogic.java_patterns.decorator.dimpl.DottedDecorator;
import com.globallogic.java_patterns.decorator.simpl.Circle;
import com.globallogic.java_patterns.decorator.simpl.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest extends WriterTest {

    @Test
    public void blueCircleTest() {
        new BlueDecorator(new Circle()).draw();
        assertEquals("circle" + System.lineSeparator() + "blue border"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void dottedCircleTest() {
        new DottedDecorator(new Circle()).draw();
        assertEquals("circle" + System.lineSeparator() + "dotted border"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void blueDottedCircleTest() {
        new DottedDecorator(new BlueDecorator(new Circle())).draw();
        assertEquals("circle" + System.lineSeparator() + "blue border"
                + System.lineSeparator() + "dotted border" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void blueRectangleTest() {
        new BlueDecorator(new Rectangle()).draw();
        assertEquals("rectangle" + System.lineSeparator() + "blue border"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void dottedRectangleTest() {
        new DottedDecorator(new Rectangle()).draw();
        assertEquals("rectangle" + System.lineSeparator() + "dotted border"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void blueDottedRectangleTest() {
        new DottedDecorator(new BlueDecorator(new Rectangle())).draw();
        assertEquals("rectangle" + System.lineSeparator() + "blue border"
                + System.lineSeparator() + "dotted border" + System.lineSeparator(), outContent.toString());
    }
}
