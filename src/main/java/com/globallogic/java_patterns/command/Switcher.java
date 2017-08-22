package com.globallogic.java_patterns.command;

public class Switcher {

    private final Command onCommand;

    private final Command offCommand;

    public Switcher(final Command onCommand, final Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void on() {
        onCommand.execute();
    }

    // or onCommand.undo() in this context
    public void off() {
        offCommand.execute();
    }
}
