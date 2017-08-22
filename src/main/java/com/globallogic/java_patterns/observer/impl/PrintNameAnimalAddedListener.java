package com.globallogic.java_patterns.observer.impl;

import com.globallogic.java_patterns.observer.AnimalAddedListener;
import com.globallogic.java_patterns.observer.model.Animal;

public class PrintNameAnimalAddedListener implements AnimalAddedListener {

    @Override
    public void onAnimalAdded(final Animal animal) {
        System.out.println("Added a new animal with name: " + animal.getName());
    }
}
