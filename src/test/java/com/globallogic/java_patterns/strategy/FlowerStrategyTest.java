package com.globallogic.java_patterns.strategy;

import com.globallogic.java_patterns.factory_method.Flower;
import com.globallogic.java_patterns.factory_method.FlowerName;
import com.globallogic.java_patterns.strategy.impl.ChamomileStrategy;
import com.globallogic.java_patterns.strategy.impl.RoseStrategy;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlowerStrategyTest {

    @Test
    public void roseStrategyTest() {
        FlowerStore context = new FlowerStore(new RoseStrategy());

        List<Flower> flowers = context.executeStrategy(7);

        assertEquals(7 * 3, flowers.size());
        assertTrue(flowers.stream().allMatch(flower -> flower.equals(FlowerName.ROSE.getInstance())));
    }

    @Test
    public void randomStrategyTest() {
        FlowerStore context = new FlowerStore(new MockRandomStrategy());
        List<Flower> flowers = context.executeStrategy(18);

        assertEquals(18, flowers.size());
        assertTrue(flowers.stream().allMatch(flower -> flower.equals(FlowerName.DANDELION.getInstance())));
    }

    @Test
    public void chamomileStrategyTest() {
        FlowerStore context = new FlowerStore(new ChamomileStrategy());

        List<Flower> flowers = context.executeStrategy(11);

        assertEquals(11, flowers.size());
        assertTrue(flowers.stream().allMatch(flower -> flower.equals(FlowerName.CHAMOMILE.getInstance())));
    }
}
