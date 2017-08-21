package com.globallogic.java_patterns.bridge;

public abstract class Transport {

    // Bridge
    private Movable transport;

    public Transport(Movable transport) {
        this.transport = transport;
    }

    public void move() {
        transport.move();
    }
}
