package com.globallogic.java_patterns.builder;

import com.globallogic.java_patterns.builder.exception.NoPizzaBuilderException;

public class Cook {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() throws NoPizzaBuilderException {
        if (pizzaBuilder == null) {
            throw new NoPizzaBuilderException();
        }
        return pizzaBuilder.getPizza();
    }
}
