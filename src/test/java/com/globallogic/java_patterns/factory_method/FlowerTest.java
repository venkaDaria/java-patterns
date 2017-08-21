package com.globallogic.java_patterns.factory_method;

import com.globallogic.java_patterns.factory_method.exception.NoFlowerException;
import com.globallogic.java_patterns.factory_method.impl.Chamomile;
import com.globallogic.java_patterns.factory_method.impl.Dandelion;
import com.globallogic.java_patterns.factory_method.impl.Rose;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlowerTest {

    @Test
    public void roseTest() {
        Flower actual = FlowerName.ROSE.getInstance();
        assertEquals(new Rose(), actual);
    }

    @Test
    public void roseTest_WithException() throws NoFlowerException {
        Flower actual = Flower.getInstance(FlowerName.ROSE);
        assertEquals(new Rose(), actual);
    }

    @Test
    public void dandelionTest() {
        Flower actual = FlowerName.DANDELION.getInstance();
        assertEquals(new Dandelion(), actual);
    }

    @Test
    public void chamomileTest() {
        Flower actual = FlowerName.CHAMOMILE.getInstance();
        assertEquals(new Chamomile(), actual);
    }
}
