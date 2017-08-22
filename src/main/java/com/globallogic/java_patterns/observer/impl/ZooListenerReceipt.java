package com.globallogic.java_patterns.observer.impl;

public class ZooListenerReceipt<ListenerType> {

    private final ListenerType listener;

    public ZooListenerReceipt(final ListenerType listener) {
        this.listener = listener;
    }

    public final ListenerType getListener() {
        return this.listener;
    }
}
