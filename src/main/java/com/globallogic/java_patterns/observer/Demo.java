package com.globallogic.java_patterns.observer;

import com.globallogic.java_patterns.observer.impl.*;
import com.globallogic.java_patterns.observer.model.Animal;
import com.globallogic.java_patterns.observer.model.Zoo;

public class Demo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.registerListener(new PrintNameAnimalAddedListener());
        zoo.registerListener(new CountingAnimalAddedListener());

        zoo.addAnimal(new Animal("Bear"));

        ZooListenerReceipt<ZooListener> listener = zoo.registerListener(
                (AnimalAddedListener) animal -> System.out.println(animal.getName())
        );

        zoo.addAnimal(new Animal("Tiger"));

        zoo.unregisterListener(listener);

        zoo.addAnimal(new Animal("Lion"));

        ZooContainer zooContainer = new ZooContainer();
        zooContainer.getZoo().addAnimal(new Animal("Tiger"));

        ZooListenerFunctor<AnimalAddedListener> functor =
                new ZooListenerFunctor<>(animal -> System.out.println("Functor: " + animal.getName()),
                        new Animal("Tiger")
                );
        functor.execute();
    }
}
