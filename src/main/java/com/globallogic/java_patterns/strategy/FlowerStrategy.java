package com.globallogic.java_patterns.strategy;

import com.globallogic.java_patterns.factory_method.Flower;

import java.util.List;

public interface FlowerStrategy {

    List<Flower> makeBouquet(int n);
}

