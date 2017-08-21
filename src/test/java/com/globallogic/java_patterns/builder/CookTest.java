package com.globallogic.java_patterns.builder;

import com.globallogic.java_patterns.builder.exception.NoPizzaBuilderException;
import com.globallogic.java_patterns.builder.impl.HawaiianPizzaBuilder;
import com.globallogic.java_patterns.builder.impl.SpicyPizzaBuilder;
import org.junit.Assert;
import org.junit.Test;

public class CookTest {

    @Test
    public void hawaiianPizzaBuilderTest() throws NoPizzaBuilderException {
        Cook cook = new Cook();
        cook.setPizzaBuilder(new HawaiianPizzaBuilder());

        Pizza expected = new Pizza();
        expected.setDough("cross");
        expected.setSauce("mild");
        expected.setTopping("ham+pineapple");

        Pizza actual = cook.getPizza();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spicyPizzaBuilderTest() throws NoPizzaBuilderException {
        Cook cook = new Cook();
        cook.setPizzaBuilder(new SpicyPizzaBuilder());

        Pizza expected = new Pizza();
        expected.setDough("pan baked");
        expected.setSauce("hot");
        expected.setTopping("pepperoni+salami");

        Pizza actual = cook.getPizza();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NoPizzaBuilderException.class)
    public void noPizzaBuilderTest() throws NoPizzaBuilderException {
        new Cook().getPizza();
    }
}
