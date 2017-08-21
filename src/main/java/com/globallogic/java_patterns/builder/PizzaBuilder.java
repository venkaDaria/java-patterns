package com.globallogic.java_patterns.builder;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    // private-protected access for one way to create Pizza (PizzaBuilder#getPizza())
    // with predetermined order of creating
    private PizzaBuilder createNew() {
        pizza = new Pizza();
        return this;
    }

    protected abstract PizzaBuilder addDough();

    protected abstract PizzaBuilder addSauce();

    protected abstract PizzaBuilder addTopping();

    public Pizza getPizza() {
        return pizza != null ? pizza : createNew().addDough().addSauce().addTopping().getPizza();
    }
}

