package com.globallogic.java_patterns.prototype.exception;

public class CopyNotSupportedException extends Throwable {
    public static final String NO_COPY = "Copy not supported";

    public CopyNotSupportedException() {
        super(NO_COPY);
    }
}
