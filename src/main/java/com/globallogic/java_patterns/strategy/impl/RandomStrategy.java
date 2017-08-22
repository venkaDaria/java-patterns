package com.globallogic.java_patterns.strategy.impl;

import com.globallogic.java_patterns.factory_method.Flower;
import com.globallogic.java_patterns.factory_method.FlowerName;
import com.globallogic.java_patterns.strategy.FlowerStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStrategy implements FlowerStrategy {

    private static final Random RANDOM = new Random();

    @Override
    public List<Flower> makeBouquet(final int numberOfFlowers) {
        return Stream.generate(this::getRandomInstance)
                .limit(numberOfFlowers)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    protected Flower getRandomInstance() {
        return RANDOM.nextBoolean() ? FlowerName.DANDELION.getInstance() : FlowerName.CHAMOMILE.getInstance();
    }
}
