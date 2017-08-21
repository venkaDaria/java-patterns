package com.globallogic.java_patterns.composite.exception;

public class BoxOverflowException extends Throwable {

    public BoxOverflowException() {
        super("Too many things, your box is full");
    }
}
