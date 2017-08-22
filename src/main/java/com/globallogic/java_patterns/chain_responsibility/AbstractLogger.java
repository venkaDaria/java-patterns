package com.globallogic.java_patterns.chain_responsibility;

public abstract class AbstractLogger {

    private Level level;

    //next element in chain or responsibility
    private AbstractLogger nextLogger;

    public void setLevel(final Level level) {
        this.level = level;
    }

    public void setNextLogger(final AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(final Level level, final String message){
        if (this.level.lessThan(level)){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(final String message);
}

