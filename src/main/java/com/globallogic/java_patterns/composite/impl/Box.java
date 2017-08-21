package com.globallogic.java_patterns.composite.impl;

import com.globallogic.java_patterns.composite.Storable;
import com.globallogic.java_patterns.composite.exception.BoxOverflowException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

// Also Box can extend directly Toy or vice versa (in other context)
public class Box implements Storable {

    // can use array?
    private List<Storable> things;

    // Box can't change his sizes
    private int limitSize;

    // add parent for box and toy? only one parent-box.

    public Box(final int limitSize) {
        this.limitSize = limitSize;
        this.things = new ArrayList<>();
    }

    public Box(final int limitSize, final Storable... things) throws BoxOverflowException {
        this(limitSize);

        if (isOverflowed(things)) {
            throw new BoxOverflowException();
        }

        this.things = Arrays.stream(things).collect(Collectors.toCollection(ArrayList::new));
    }

    private static int size(final List<Storable> elements, final ToIntFunction<? super Storable> countElements) {
        return elements.stream().mapToInt(countElements).sum();
    }

    @Override
    public int getLimitSize() {
        return limitSize;
    }

    @Override
    public int getCount() {
        return size(this.things, Storable::getCount);
    }

    public int getEmptyPlaces() {
        return getLimitSize() - size(this.things, Storable::getLimitSize);
    }

    @Override
    public void print() {
        things.forEach(System.out::println);
    }

    public void add(final Storable storable) throws BoxOverflowException {
        if (isOverflowed(this.things, storable)) {
            throw new BoxOverflowException();
        }

        things.add(storable);
    }

    public boolean contains(final Storable storable) {
        return things.contains(storable);
    }

    public int indexOf(final Storable storable) {
        return things.indexOf(storable);
    }

    public Storable get(final int idx) {
        return things.get(idx);
    }

    public void remove(final Storable storable) {
        things.remove(storable);
    }

    public void remove(final int idx) {
        things.remove(idx);
    }

    @Override
    public String toString() {
        final CharSequence DELIMITER = System.lineSeparator().subSequence(0, System.lineSeparator().length());

        return this.things.stream().map(Object::toString).collect(Collectors.joining(DELIMITER));
    }

    @Override
    public boolean equals(final Object o) {
        return this == o || !(o == null || getClass() != o.getClass()) && things.equals(((Box) o).things);
    }

    @Override
    public int hashCode() {
        return things.hashCode();
    }

    private boolean isOverflowed(final Storable... things) {
        return isOverflowed(Arrays.asList(things));
    }

    private boolean isOverflowed(final List<Storable> things, final Storable newElement) {
        List<Storable> newList = new ArrayList<>(things);
        newList.add(newElement);
        return isOverflowed(newList);
    }

    private boolean isOverflowed(final List<Storable> things) {
        return this.limitSize < size(things, Storable::getLimitSize);
    }
}
