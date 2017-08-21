package com.globallogic.java_pattern.abstract_factory.sad;

import com.globallogic.java_pattern.abstract_factory.GoodbyeWriter;

public class SadGoodbyeWriter implements GoodbyeWriter {

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye :(");
    }
}
