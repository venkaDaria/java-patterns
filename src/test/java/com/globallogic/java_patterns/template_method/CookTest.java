package com.globallogic.java_patterns.template_method;

import com.globallogic.java_patterns.builder.Pizza;
import com.globallogic.java_patterns.template_method.impl.HawaiianCook;
import com.globallogic.java_patterns.template_method.impl.SpicyCook;
import org.junit.Assert;
import org.junit.Test;

public class CookTest {

    @Test
    public void hawaiianCookTest() {
        Cook cook = new HawaiianCook();

        Pizza expected = new Pizza();
        expected.setDough("cross");
        expected.setSauce("mild");
        expected.setTopping("ham+pineapple");

        Pizza actual = cook.createPizza();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spicyCookTest() {
        Cook cook = new SpicyCook();

        Pizza expected = new Pizza();
        expected.setDough("pan baked");
        expected.setSauce("hot");
        expected.setTopping("pepperoni+salami");

        Pizza actual = cook.createPizza();

        Assert.assertEquals(expected, actual);
    }
}
