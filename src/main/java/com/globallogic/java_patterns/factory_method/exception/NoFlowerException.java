package com.globallogic.java_patterns.factory_method.exception;

public class NoFlowerException extends Throwable {

    public static final String NO_FLOWER = "No flower";

    public NoFlowerException() {
        super(NO_FLOWER);
    }
}
