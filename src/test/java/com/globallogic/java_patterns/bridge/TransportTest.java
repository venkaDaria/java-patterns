package com.globallogic.java_patterns.bridge;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.bridge.aimpl.MusicTransport;
import com.globallogic.java_patterns.bridge.rimpl.Car;
import com.globallogic.java_patterns.bridge.rimpl.Plane;
import com.globallogic.java_patterns.bridge.rimpl.Ship;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest extends WriterTest {

    @Test
    public void carTest() {
        Transport transport = new MusicTransport(new Car());
        transport.move();

        assertEquals("Go by car" + System.lineSeparator() + "with beautiful song"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void planeTest() {
        Transport transport = new MusicTransport(new Plane());
        transport.move();

        assertEquals("Go by plane" + System.lineSeparator() + "with beautiful song"
                + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void shipTest() {
        Transport transport = new MusicTransport(new Ship());
        transport.move();

        assertEquals("Go by ship" + System.lineSeparator() + "with beautiful song"
                + System.lineSeparator(), outContent.toString());
    }
}
