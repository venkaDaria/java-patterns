package com.globallogic.java_patterns.template_method;

import com.globallogic.java_patterns.builder.Pizza;

public abstract class Cook {

    public Pizza createPizza() {
        Pizza pizza = new Pizza();

        addDough(pizza);
        addSauce(pizza);
        addTopping(pizza);

        return pizza;
    }

    protected abstract void addDough(final Pizza pizza);

    protected abstract void addSauce(final Pizza pizza);

    protected abstract void addTopping(final Pizza pizza);
}
