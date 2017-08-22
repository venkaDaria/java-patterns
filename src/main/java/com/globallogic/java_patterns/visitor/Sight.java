package com.globallogic.java_patterns.visitor;

public interface Sight {

    void accept(final SightVisitor sightVisitor);
}
