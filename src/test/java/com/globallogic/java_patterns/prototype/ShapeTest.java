package com.globallogic.java_patterns.prototype;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;
import com.globallogic.java_patterns.prototype.impl.Circle;
import com.globallogic.java_patterns.prototype.impl.FakeShape;
import com.globallogic.java_patterns.prototype.impl.Rectangle;
import com.globallogic.java_patterns.prototype.impl.Square;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ShapeTest extends WriterTest {

    @Test
    public void circleTest() throws CopyNotSupportedException, IOException {
        Circle expected = new Circle();
        expected.setColor("red");

        // complicated objects can copy not all fields, only important for client
        Circle actual = expected.copy();

        expected.draw();
        String expectedString = outContent.toString();
        actual.draw();

        assertEquals(expectedString + expectedString, outContent.toString());
    }

    @Test
    public void rectangleTest() throws CopyNotSupportedException {
        Rectangle expected = new Rectangle();
        expected.setColor("green");

        Rectangle actual = expected.copy();

        expected.draw();
        String expectedString = outContent.toString();
        actual.draw();

        assertEquals(expectedString + expectedString, outContent.toString());
    }

    @Test
    public void squareTest() throws CopyNotSupportedException {
        Square expected = new Square();
        expected.setColor("blue");

        Square actual = expected.copy();

        expected.draw();
        String expectedString = outContent.toString();
        actual.draw();

        assertEquals(expectedString + expectedString, outContent.toString());
    }

    @Test(expected = CopyNotSupportedException.class)
    public void shapeTest_CloneNotSupported() throws CopyNotSupportedException {
        new FakeShape().copy();
    }
}
