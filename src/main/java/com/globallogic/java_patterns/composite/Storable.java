package com.globallogic.java_patterns.composite;

// Composite - tree and nodes, panel and ui-components, calculable expressions...
public interface Storable {

    default int getLimitSize() {
        return getCount();
    }

    default int getCount() {
        return 1;
    }

    void print();
}
