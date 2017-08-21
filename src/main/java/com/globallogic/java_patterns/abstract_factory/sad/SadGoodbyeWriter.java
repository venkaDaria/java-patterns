package com.globallogic.java_patterns.abstract_factory.sad;

import com.globallogic.java_patterns.abstract_factory.GoodbyeWriter;

public class SadGoodbyeWriter implements GoodbyeWriter {

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye :(");
    }
}
