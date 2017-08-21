package com.globallogic.java_patterns.factory_method;

import com.globallogic.java_patterns.factory_method.exception.NoFlowerException;
import com.globallogic.java_patterns.factory_method.impl.Chamomile;
import com.globallogic.java_patterns.factory_method.impl.Dandelion;
import com.globallogic.java_patterns.factory_method.impl.Rose;

public abstract class Flower {

    private String color;

    private int numberOfPetals;

    // way with switch (FactoryMethod), can be moved in another class
    public static Flower getInstance(FlowerName flowerName) throws NoFlowerException {
        switch (flowerName) {
            case ROSE:
                return new Rose();
            case DANDELION:
                return new Dandelion();
            case CHAMOMILE:
                return new Chamomile();
            default:
                throw new NoFlowerException();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(final int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    @Override
    public String toString() {
        return String.format("%s flower with %d petals", color, numberOfPetals);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;
        return numberOfPetals == flower.numberOfPetals && color.equals(flower.color);
    }

    @Override
    public int hashCode() {
        return 31 * color.hashCode() + numberOfPetals;
    }
}
