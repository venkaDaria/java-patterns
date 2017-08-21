package com.globallogic.java_patterns.abstract_factory;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.abstract_factory.exception.NoMoodException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WriterFactoryTest extends WriterTest {

    @Test
    public void testHappyHelloWriter() throws NoMoodException {
        WriterFactory.getInstance(Mood.HAPPY).createHelloWriter().sayHello();
        assertEquals("Hello!)" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testSadHelloWriter() throws NoMoodException {
        WriterFactory.getInstance(Mood.SAD).createHelloWriter().sayHello();
        assertEquals("Hello :(" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testHappyGoodbyeWriter() throws NoMoodException {
        WriterFactory.getInstance(Mood.HAPPY).createGoodbyeWriter().sayGoodbye();
        assertEquals("Goodbye!)" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testSadyGoodbyeoWriter() throws NoMoodException {
        WriterFactory.getInstance(Mood.SAD).createGoodbyeWriter().sayGoodbye();
        assertEquals("Goodbye :(" + System.lineSeparator(), outContent.toString());
    }
}
