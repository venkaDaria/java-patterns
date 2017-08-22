package com.globallogic.java_patterns.state;

public class MusicBox {

    private PlayerState state;

    public PlayerState getState() {
        return state;
    }

    public void setState(final PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.doAction();
    }
}
