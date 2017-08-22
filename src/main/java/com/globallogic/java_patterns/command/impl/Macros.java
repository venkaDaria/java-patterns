package com.globallogic.java_patterns.command.impl;

import com.globallogic.java_patterns.command.Command;

import java.util.LinkedList;

public class Macros implements Command {

    private final LinkedList<Command> commands;

    public Macros(LinkedList<Command> commands){
        this.commands = new LinkedList<>(commands);
    }

    public void execute() {
        commands.forEach(Command::execute);
    }

    public void undo(){
        commands.descendingIterator().forEachRemaining(Command::undo);
    }
}
