package com.globallogic.java_patterns.facade;

import com.globallogic.java_patterns.WriterTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacadeTest extends WriterTest {

    @Test
    public void serveCutleryTest() {
        ServeFacade facade = new ServeFacade();
        facade.putCutlery();

        assertEquals("Put a fork" + System.lineSeparator() + "Put a fork" + System.lineSeparator() +
                "Put a knife" + System.lineSeparator() + "Put a knife" + System.lineSeparator() +
                "Put a spoon" + System.lineSeparator(), outContent.toString());
    }
}
