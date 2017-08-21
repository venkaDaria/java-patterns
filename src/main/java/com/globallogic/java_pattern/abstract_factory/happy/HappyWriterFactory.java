package com.globallogic.java_pattern.abstract_factory.happy;

import com.globallogic.java_pattern.abstract_factory.GoodbyeWriter;
import com.globallogic.java_pattern.abstract_factory.HelloWriter;
import com.globallogic.java_pattern.abstract_factory.WriterFactory;

public class HappyWriterFactory implements WriterFactory {
    @Override
    public HelloWriter createHelloWriter() {
        return new HappyHelloWriter(); // can be singleton
    }

    @Override
    public GoodbyeWriter createGoodbyeWriter() {
        return new HappyGoodbyeWriter(); // can be singleton
    }
}
