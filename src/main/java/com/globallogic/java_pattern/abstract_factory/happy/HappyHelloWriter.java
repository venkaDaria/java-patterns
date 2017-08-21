package com.globallogic.java_pattern.abstract_factory.happy;

import com.globallogic.java_pattern.abstract_factory.HelloWriter;

public class HappyHelloWriter implements HelloWriter {

    @Override
    public void sayHello() {
        System.out.println("Hello!)");
    }
}
