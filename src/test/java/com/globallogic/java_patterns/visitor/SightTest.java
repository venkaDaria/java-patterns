package com.globallogic.java_patterns.visitor;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.visitor.impl.*;
import com.globallogic.java_patterns.visitor.impl_visitor.HappyVisitor;
import com.globallogic.java_patterns.visitor.impl_visitor.SadVisitor;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SightTest extends WriterTest {

    @Test
    public void happyCinemaTest() {
        new Cinema().accept(new HappyVisitor());

        assertEquals("I love cinemas" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void sadTheaterTest() {
        new Theater().accept(new SadVisitor());

        assertEquals("I don't like theaters" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void unknownSightTest() {
        new UnknownSight().accept(new HappyVisitor());

        assertEquals("I don't know this sight: UnknownSight" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void unknownSightTest_NewVisitor() {
        new UnknownSight().accept(new HappyVisitor() {
            public void visit(final Sight s) {
                System.out.println("Hello!");
            }
        });

        assertEquals("Hello!" + System.lineSeparator(), outContent.toString());
    }
}
