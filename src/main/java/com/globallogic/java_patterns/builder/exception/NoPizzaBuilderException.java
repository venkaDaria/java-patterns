package com.globallogic.java_patterns.builder.exception;

public class NoPizzaBuilderException extends Throwable {

    private static final String NO_PIZZA_BUILDER = "PizzaBuilder doesn't set for Cook";

    public NoPizzaBuilderException() {
        super(NO_PIZZA_BUILDER);
    }
}
