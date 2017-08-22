package com.globallogic.java_patterns.observer;

import com.globallogic.java_patterns.observer.model.Animal;

public interface AnimalAddedListener extends ZooListener {

    void onAnimalAdded(final Animal animal);
}
