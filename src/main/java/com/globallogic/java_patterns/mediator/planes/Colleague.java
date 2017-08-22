package com.globallogic.java_patterns.mediator.planes;

public abstract class Colleague {

    private Mediator mediator;

    public Colleague(final Mediator m) {
        mediator = m;
    }

    public void send(final String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(final String message);
}
