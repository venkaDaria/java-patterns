package com.globallogic.java_patterns.factory_method.impl;

import com.globallogic.java_patterns.factory_method.Flower;

public class Rose extends Flower {

    public Rose() {
        setColor("red");
        setNumberOfPetals(7);
    }
}
