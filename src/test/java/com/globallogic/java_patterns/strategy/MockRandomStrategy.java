package com.globallogic.java_patterns.strategy;

import com.globallogic.java_patterns.factory_method.Flower;
import com.globallogic.java_patterns.factory_method.FlowerName;
import com.globallogic.java_patterns.strategy.impl.RandomStrategy;

public class MockRandomStrategy extends RandomStrategy {

    @Override
    protected Flower getRandomInstance() {
        return FlowerName.DANDELION.getInstance();
    }
}
