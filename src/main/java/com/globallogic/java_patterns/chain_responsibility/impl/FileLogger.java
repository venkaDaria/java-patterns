package com.globallogic.java_patterns.chain_responsibility.impl;

import com.globallogic.java_patterns.chain_responsibility.AbstractLogger;
import com.globallogic.java_patterns.chain_responsibility.Level;

public class FileLogger extends AbstractLogger {

    public FileLogger(final Level level){
        setLevel(level);
    }

    @Override
    protected void write(final String message) {
        System.out.println("File::Logger: " + message);
    }
}
