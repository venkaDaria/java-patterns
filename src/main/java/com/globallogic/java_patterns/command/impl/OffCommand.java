package com.globallogic.java_patterns.command.impl;

import com.globallogic.java_patterns.command.Command;
import com.globallogic.java_patterns.command.model.Light;

public class OffCommand implements Command {

    private final Light light;

    public OffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }

    public void undo() {
        light.turnOn();
    }
}
