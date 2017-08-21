package com.globallogic.java_patterns.builder.impl;

import com.globallogic.java_patterns.builder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    public PizzaBuilder addDough() {
        pizza.setDough("cross");
        return this;
    }

    public PizzaBuilder addSauce() {
        pizza.setSauce("mild");
        return this;
    }

    public PizzaBuilder addTopping() {
        pizza.setTopping("ham+pineapple");
        return this;
    }
}
