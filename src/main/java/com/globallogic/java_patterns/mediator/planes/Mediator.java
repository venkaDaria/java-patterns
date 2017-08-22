package com.globallogic.java_patterns.mediator.planes;

public interface Mediator {

    void send(String message, Colleague colleague);
}

