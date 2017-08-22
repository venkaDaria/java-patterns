package com.globallogic.java_patterns.command;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.command.impl.Macros;
import com.globallogic.java_patterns.command.impl.OffCommand;
import com.globallogic.java_patterns.command.impl.OnCommand;
import com.globallogic.java_patterns.command.model.Light;
import com.globallogic.java_patterns.command.model.TV;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SwitcherTest extends WriterTest {

    private TV tv;

    private Light light;

    private Switcher switcher;

    @Before
    public void createSwitcher() {
        tv = new TV();
        light = new Light();

        LinkedList<Command> onCommands = new LinkedList<>();
        onCommands.add(new OnCommand(tv));
        onCommands.add(new OnCommand(light));

        LinkedList<Command> offCommands = new LinkedList<>();
        offCommands.add(new OffCommand(tv));

        switcher = new Switcher(new Macros(onCommands), new Macros(offCommands));
    }

    @Test
    public void onTest() {
        switcher.on();

        assertEquals("TV on" + System.lineSeparator() +
                "Light on" + System.lineSeparator(), outContent.toString());

        assertTrue(tv.isLight());
        assertTrue(light.isLight());
    }

    @Test
    public void offTest() {
        light.turnOn();
        tv.turnOn();

        switcher.off();

        assertEquals("Light on" + System.lineSeparator() + "TV on" + System.lineSeparator() +
                "TV off" + System.lineSeparator(), outContent.toString());

        assertFalse(tv.isLight());
        assertTrue(light.isLight());
    }
}
