package com.globallogic.java_patterns.chain_responsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(final Level level){
        setLevel(level);
    }

    @Override
    protected void write(final String message) {
        System.err.println("Error Console::Logger: " + message);
    }
}
