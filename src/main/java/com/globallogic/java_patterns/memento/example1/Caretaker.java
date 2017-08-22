package com.globallogic.java_patterns.memento.example1;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento() {
        return getMemento(mementos.size() - 1);
    }

    public Memento getMemento(int idx) {
        return mementos.get(idx);
    }
}
