package com.globallogic.java_pattern.abstract_factory.sad;

import com.globallogic.java_pattern.abstract_factory.HelloWriter;

public class SadHelloWriter implements HelloWriter {

    @Override
    public void sayHello() {
        System.out.println("Hello :(");
    }
}
