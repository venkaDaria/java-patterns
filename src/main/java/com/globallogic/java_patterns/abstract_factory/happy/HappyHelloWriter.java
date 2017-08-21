package com.globallogic.java_patterns.abstract_factory.happy;

import com.globallogic.java_patterns.abstract_factory.HelloWriter;

public class HappyHelloWriter implements HelloWriter {

    @Override
    public void sayHello() {
        System.out.println("Hello!)");
    }
}
