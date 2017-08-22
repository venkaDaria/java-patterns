package com.globallogic.java_patterns.state.impl;

import com.globallogic.java_patterns.state.PlayerState;

public class StopState implements PlayerState {

    @Override
    public void doAction() {
        System.out.println("I stopped");
    }
}
