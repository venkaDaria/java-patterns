package com.globallogic.java_patterns.facade;

import com.globallogic.java_patterns.facade.impl.Fork;
import com.globallogic.java_patterns.facade.impl.Knife;
import com.globallogic.java_patterns.facade.impl.Spoon;

public class ServeFacade {

    private Spoon spoon;

    private Fork fork;

    private Knife knife;

    public ServeFacade() {
        spoon = new Spoon();
        fork = new Fork();
        knife = new Knife();
    }

    public void putCutlery() {
        fork.put();
        fork.put();
        knife.put();
        knife.put();
        spoon.put();
    }
}
