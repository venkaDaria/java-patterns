package com.globallogic.java_patterns.prototype.impl;

import com.globallogic.java_patterns.prototype.Copyable;
import com.globallogic.java_patterns.prototype.Shape;
import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;

public class FakeShape extends Shape {

    @Override
    public void draw() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Copyable copy() throws CopyNotSupportedException {
        throw new CopyNotSupportedException();
    }
}
