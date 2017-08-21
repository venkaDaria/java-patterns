package com.globallogic.java_patterns.abstract_factory.happy;

import com.globallogic.java_patterns.abstract_factory.GoodbyeWriter;

public class HappyGoodbyeWriter implements GoodbyeWriter {

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye!)");
    }
}
