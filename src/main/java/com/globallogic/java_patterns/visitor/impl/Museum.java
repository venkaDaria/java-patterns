package com.globallogic.java_patterns.visitor.impl;

import com.globallogic.java_patterns.visitor.Sight;
import com.globallogic.java_patterns.visitor.SightVisitor;

public class Museum implements Sight {

    public void accept(final SightVisitor sightVisitor) {
        sightVisitor.visit(this);
    }
}
