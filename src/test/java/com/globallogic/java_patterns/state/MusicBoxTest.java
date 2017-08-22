package com.globallogic.java_patterns.state;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.state.impl.PauseState;
import com.globallogic.java_patterns.state.impl.StartState;
import com.globallogic.java_patterns.state.impl.StopState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBoxTest extends WriterTest {

    private MusicBox mbox = new MusicBox();

    @Test
    public void playStopTest() {
        mbox.setState(new StopState());
        mbox.play();

        assertEquals("I stopped" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void playPauseTest() {
        mbox.setState(new PauseState());
        mbox.play();

        assertEquals("I paused" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void playStartTest() {
        mbox.setState(new StartState());
        mbox.play();

        assertEquals("I started" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void playNewStateTest() {
        mbox.setState(() -> System.out.println("Hello!"));
        mbox.play();

        assertEquals("Hello!" + System.lineSeparator(), outContent.toString());
    }
}
