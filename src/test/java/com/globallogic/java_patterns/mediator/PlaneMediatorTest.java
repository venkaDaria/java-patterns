package com.globallogic.java_patterns.mediator;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.mediator.planes.impl.Helicopter;
import com.globallogic.java_patterns.mediator.planes.impl.Plane;
import com.globallogic.java_patterns.mediator.planes.impl.PlaneMediator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneMediatorTest extends WriterTest {

    private Plane plane;

    private Helicopter helicopter;

    @Before
    public void createMediator() {
        PlaneMediator mediator = new PlaneMediator();

        plane = new Plane(mediator);
        helicopter = new Helicopter(mediator);

        mediator.addColleague(plane);
        mediator.addColleague(helicopter);
    }

    @Test
    public void sendMessageTest_Plane() {
        plane.send("Hello World");
        assertEquals("Helicopter received: Hello World" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void sendMessageTest_Helicopter() {
        helicopter.send("Hello");
        assertEquals("Plane received: Hello" + System.lineSeparator(), outContent.toString());
    }
}
