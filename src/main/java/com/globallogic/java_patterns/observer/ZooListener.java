package com.globallogic.java_patterns.observer;

import com.globallogic.java_patterns.observer.model.Animal;

public interface ZooListener {

    default void onAnimalRemoved(final Animal animal) {
    }

    default void onAnimalAdded(final Animal animal) {
    }
}
