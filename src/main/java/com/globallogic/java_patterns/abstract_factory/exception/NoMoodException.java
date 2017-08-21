package com.globallogic.java_patterns.abstract_factory.exception;

public class NoMoodException extends Throwable {

    private static final String NO_MOOD = "No mood";

    public NoMoodException() {
        super(NO_MOOD);
    }
}
