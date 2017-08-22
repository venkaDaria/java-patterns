package com.globallogic.java_patterns.mediator.planes.impl;

import com.globallogic.java_patterns.mediator.planes.Colleague;
import com.globallogic.java_patterns.mediator.planes.Mediator;

public class Helicopter extends Colleague {

    public Helicopter(final Mediator m) {
        super(m);
    }

    public void receive(final String message) {
        System.out.println("Helicopter received: " + message);
    }
}
