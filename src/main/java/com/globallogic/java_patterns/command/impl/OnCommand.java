package com.globallogic.java_patterns.command.impl;

import com.globallogic.java_patterns.command.Command;
import com.globallogic.java_patterns.command.model.Light;

public class OnCommand implements Command {

    private final Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo(){
        light.turnOff();
    }
}
