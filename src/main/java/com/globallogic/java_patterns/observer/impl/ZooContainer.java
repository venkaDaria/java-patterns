package com.globallogic.java_patterns.observer.impl;

import com.globallogic.java_patterns.observer.AnimalAddedListener;
import com.globallogic.java_patterns.observer.model.Animal;
import com.globallogic.java_patterns.observer.model.Zoo;

public class ZooContainer implements AnimalAddedListener {

    private Zoo zoo = new Zoo();

    public ZooContainer() {
        this.zoo.registerListener(this);
    }

    public Zoo getZoo() {
        return this.zoo;
    }

    @Override
    public void onAnimalAdded(final Animal animal) {
        System.out.println("Added animal to Zoo with name: " + animal.getName());
    }
}
