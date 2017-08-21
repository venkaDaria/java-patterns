package com.globallogic.java_patterns.builder.impl;

import com.globallogic.java_patterns.builder.PizzaBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {

    public PizzaBuilder addDough() {
        pizza.setDough("pan baked");
        return this;
    }

    public PizzaBuilder addSauce() {
        pizza.setSauce("hot");
        return this;
    }

    public PizzaBuilder addTopping() {
        pizza.setTopping("pepperoni+salami");
        return this;
    }
}
