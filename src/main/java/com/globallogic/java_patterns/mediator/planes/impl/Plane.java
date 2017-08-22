package com.globallogic.java_patterns.mediator.planes.impl;

import com.globallogic.java_patterns.mediator.planes.Colleague;
import com.globallogic.java_patterns.mediator.planes.Mediator;

public class Plane extends Colleague {

    public Plane(final Mediator m) {
        super(m);
    }

    public void receive(final String message) {
        System.out.println("Plane received: " + message);
    }
}
