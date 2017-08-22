package com.globallogic.java_patterns.mediator.planes.impl;

import com.globallogic.java_patterns.mediator.planes.Colleague;
import com.globallogic.java_patterns.mediator.planes.Mediator;

import java.util.ArrayList;

public class PlaneMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public PlaneMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(final Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(final String message, final Colleague originator) {
        colleagues.stream().filter(col -> col != originator).forEach(col -> col.receive(message));
    }
}
