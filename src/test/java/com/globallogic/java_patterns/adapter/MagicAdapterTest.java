package com.globallogic.java_patterns.adapter;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.adapter.impl.MagicArtifact;
import com.globallogic.java_patterns.adapter.impl.Magician;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicAdapterTest extends WriterTest {

    @Test
    public void objectAdapterLightTest() {
        new Magician().light();
        assertEquals("Lumos!" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void classAdapterLightTest() {
        new MagicArtifact().light();
        // also can use MagicWand methods (unlike Magician)

        assertEquals("Lumos!" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void objectAdapterWaterTest() {
        new Magician().water();
        assertEquals("Aguamenti!" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void classAdapterWaterest() {
        new MagicArtifact().water();
        assertEquals("Aguamenti!" + System.lineSeparator(), outContent.toString());
    }
}
