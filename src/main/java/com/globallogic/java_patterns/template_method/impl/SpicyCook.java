package com.globallogic.java_patterns.template_method.impl;

import com.globallogic.java_patterns.builder.Pizza;
import com.globallogic.java_patterns.template_method.Cook;

public class SpicyCook extends Cook {

    public void addDough(final Pizza pizza) {
        pizza.setDough("pan baked");
    }

    public void addSauce(final Pizza pizza) {
        pizza.setSauce("hot");
    }

    public void addTopping(final Pizza pizza) {
        pizza.setTopping("pepperoni+salami");
    }
}
