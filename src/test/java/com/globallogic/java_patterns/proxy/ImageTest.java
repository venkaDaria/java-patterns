package com.globallogic.java_patterns.proxy;

import com.globallogic.java_patterns.WriterTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageTest extends WriterTest {

    @Test
    public void proxyImageTest() {
        Image image1 = new ImageProxy();

        System.out.println(image1.get("Flowers.jpg"));
        System.out.println(image1.get("Flowers.jpg"));

        assertEquals("some expensive operation for loading image" + System.lineSeparator() +
                "image with name \"Flowers.jpg\"" + System.lineSeparator() +
                "image with name \"Flowers.jpg\"" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void largeImageTest_KeyExists() {
        Image image2 = new LargeImage();

        System.out.println(image2.get("Sky.jpg"));
        System.out.println(image2.get("Sky.jpg"));

        assertEquals("some expensive operation for loading image" + System.lineSeparator() +
                "image with name \"Sky.jpg\"" + System.lineSeparator() +
                "some expensive operation for loading image" + System.lineSeparator() +
                "image with name \"Sky.jpg\"" + System.lineSeparator(), outContent.toString());
    }
}
