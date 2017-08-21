package com.globallogic.java_pattern.abstract_factory.sad;

import com.globallogic.java_pattern.abstract_factory.GoodbyeWriter;
import com.globallogic.java_pattern.abstract_factory.HelloWriter;
import com.globallogic.java_pattern.abstract_factory.WriterFactory;

public class SadWriterFactory implements WriterFactory {

    @Override
    public HelloWriter createHelloWriter() {
        return new SadHelloWriter(); // can be singleton
    }

    @Override
    public GoodbyeWriter createGoodbyeWriter() {
        return new SadGoodbyeWriter(); // can be singleton
    }
}
