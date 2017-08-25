package com.globallogic.java_patterns.flyweight;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.flyweight.impl.Roman;
import com.globallogic.java_patterns.flyweight.impl.Story;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest extends WriterTest {

    @Before
    public void before() {
        BookFactory.clear();
    }

    @Test
    public void getStoryTest() {
        Story story = BookFactory.getStory("Hello");
        story.read();

        assertEquals("Hello", story.getTitle());
        assertEquals("Reading a short story" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void getTwiceStoryTest() {
        BookFactory.getStory("Hello 2");

        Story story = BookFactory.getStory("Hello 2");
        story.read();

        assertEquals("Reading a short story" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void getRomanTest() {
        Roman roman = BookFactory.getRoman("Hello");
        roman.read(20);

        assertEquals("Hello", roman.getTitle());
        assertEquals("Reading a page: 20" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void getRomanTwiceTest() {
        BookFactory.getRoman("Hello").read(20);
        BookFactory.getRoman("Hello").read(5);

        assertEquals("Reading a page: 20" + System.lineSeparator()
                + "Reading a page: 25" + System.lineSeparator(), outContent.toString());
    }
}
