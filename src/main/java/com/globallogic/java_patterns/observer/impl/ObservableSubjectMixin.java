package com.globallogic.java_patterns.observer.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class ObservableSubjectMixin<ListenerType> {

    private List<ListenerType> listeners = new ArrayList<>();

    public ZooListenerReceipt<ListenerType> registerListener(final ListenerType listener) {
        this.listeners.add(listener);
        return new ZooListenerReceipt<>(listener);
    }

    public void unregisterListener(final ZooListenerReceipt<ListenerType> listener) {
        this.listeners.remove(listener.getListener());
    }

    public void notifyListeners(final Consumer<? super ListenerType> algorithm) {
        this.listeners.forEach(algorithm);
    }
}