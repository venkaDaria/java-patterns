package com.globallogic.java_patterns.strategy;

import com.globallogic.java_patterns.factory_method.Flower;

import java.util.List;

public class FlowerStore {

    private final FlowerStrategy strategy;

    public FlowerStore(final FlowerStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Flower> executeStrategy(final int count) {
        return strategy.makeBouquet(count);
    }
}
