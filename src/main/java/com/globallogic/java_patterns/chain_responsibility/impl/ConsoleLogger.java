package com.globallogic.java_patterns.chain_responsibility.impl;

import com.globallogic.java_patterns.chain_responsibility.AbstractLogger;
import com.globallogic.java_patterns.chain_responsibility.Level;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(final Level level){
        setLevel(level);
    }

    @Override
    protected void write(final String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
