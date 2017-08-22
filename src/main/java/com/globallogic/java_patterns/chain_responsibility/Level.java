package com.globallogic.java_patterns.chain_responsibility;

public enum Level {
    INFO, DEBUG, ERROR;

    public boolean lessThan(final Level level) {
        return compareTo(level) <= 0;
    }
}
