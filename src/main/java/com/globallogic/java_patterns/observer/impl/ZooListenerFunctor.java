package com.globallogic.java_patterns.observer.impl;

import com.globallogic.java_patterns.observer.ZooListener;
import com.globallogic.java_patterns.observer.model.Animal;

public class ZooListenerFunctor<ListenerType extends ZooListener> {

    private final ListenerType listener;

    private final Animal parameter;

    public ZooListenerFunctor(final ListenerType listener, final Animal parameter) {
        this.listener = listener;
        this.parameter = parameter;
    }

    public void execute() {
        this.listener.onAnimalAdded(this.parameter);
    }
}