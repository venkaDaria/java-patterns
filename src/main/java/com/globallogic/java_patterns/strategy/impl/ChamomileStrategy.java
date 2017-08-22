package com.globallogic.java_patterns.strategy.impl;

import com.globallogic.java_patterns.factory_method.Flower;
import com.globallogic.java_patterns.factory_method.FlowerName;
import com.globallogic.java_patterns.strategy.FlowerStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChamomileStrategy implements FlowerStrategy {

    @Override
    public List<Flower> makeBouquet(final int numberOfFlowers) {
        return Stream.generate(FlowerName.CHAMOMILE::getInstance)
                .limit(numberOfFlowers)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
