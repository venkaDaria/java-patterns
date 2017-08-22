package com.globallogic.java_patterns.template_method.impl;

import com.globallogic.java_patterns.builder.Pizza;
import com.globallogic.java_patterns.template_method.Cook;

public class HawaiianCook extends Cook {

    public void addDough(final Pizza pizza) {
        pizza.setDough("cross");
    }

    public void addSauce(final Pizza pizza) {
        pizza.setSauce("mild");
    }

    public void addTopping(final Pizza pizza) {
        pizza.setTopping("ham+pineapple");
    }
}
