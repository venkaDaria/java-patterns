package com.globallogic.java_patterns.observer.model;

import com.globallogic.java_patterns.observer.ZooListener;
import com.globallogic.java_patterns.observer.impl.ObservableSubjectMixin;

import java.util.ArrayList;
import java.util.List;

public class Zoo extends ObservableSubjectMixin<ZooListener> {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(final Animal animal) {
        this.animals.add(animal);
        this.notifyListeners((listener) -> listener.onAnimalAdded(animal));
    }

    public void removeAnimal(final Animal animal) {
        this.animals.remove(animal);
        this.notifyListeners((listener) -> listener.onAnimalRemoved(animal));
    }
}
