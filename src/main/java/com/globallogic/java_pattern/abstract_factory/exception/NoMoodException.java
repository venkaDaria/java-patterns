package com.globallogic.java_pattern.abstract_factory.exception;

public class NoMoodException extends Throwable {

    private static final String NO_MOOD = "No mood";

    public NoMoodException() {
        super(NO_MOOD);
    }
}
