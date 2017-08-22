package com.globallogic.java_patterns.observer.impl;

import com.globallogic.java_patterns.observer.AnimalAddedListener;
import com.globallogic.java_patterns.observer.model.Animal;

public class CountingAnimalAddedListener implements AnimalAddedListener {

    private static int animalsAddedCount = 0;

    @Override
    public void onAnimalAdded(final Animal animal) {
        System.out.println("Total animals added: " + ++animalsAddedCount);
    }
}
