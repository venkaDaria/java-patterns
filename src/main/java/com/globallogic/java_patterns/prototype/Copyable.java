package com.globallogic.java_patterns.prototype;

import com.globallogic.java_patterns.prototype.exception.CopyNotSupportedException;

public interface Copyable {

    Copyable copy() throws CopyNotSupportedException;
}
