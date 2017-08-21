package com.globallogic.java_patterns.abstract_factory.sad;

import com.globallogic.java_patterns.abstract_factory.HelloWriter;

public class SadHelloWriter implements HelloWriter {

    @Override
    public void sayHello() {
        System.out.println("Hello :(");
    }
}
