package com.globallogic.java_patterns.strategy;

import com.globallogic.java_patterns.factory_method.FlowerName;
import com.globallogic.java_patterns.strategy.impl.ChamomileStrategy;
import com.globallogic.java_patterns.strategy.impl.RandomStrategy;
import com.globallogic.java_patterns.strategy.impl.RoseStrategy;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        FlowerStore context = new FlowerStore(new ChamomileStrategy());
        System.out.println("Chamomile: " + context.executeStrategy(11));

        context = new FlowerStore(new RoseStrategy());
        System.out.println("Rose: " + context.executeStrategy(7));

        context = new FlowerStore(new RandomStrategy());
        System.out.println("Random: " + context.executeStrategy(18));

        context = new FlowerStore(numberOfFlowers -> Stream.generate(FlowerName.DANDELION::getInstance)
                .limit(numberOfFlowers)
                .collect(Collectors.toCollection(ArrayList::new))
        );
        System.out.println("Random: " + context.executeStrategy(3));
    }
}
