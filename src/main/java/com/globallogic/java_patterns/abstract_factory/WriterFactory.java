package com.globallogic.java_patterns.abstract_factory;

import com.globallogic.java_patterns.abstract_factory.exception.NoMoodException;
import com.globallogic.java_patterns.abstract_factory.happy.HappyWriterFactory;
import com.globallogic.java_patterns.abstract_factory.sad.SadWriterFactory;

public interface WriterFactory {

    static WriterFactory getInstance(Mood mood) throws NoMoodException {
        switch(mood){
            case HAPPY:
                return new HappyWriterFactory(); // can be singletons
            case SAD:
                return new SadWriterFactory();
            default:
                throw new NoMoodException();
        }
    }

    HelloWriter createHelloWriter();

    GoodbyeWriter createGoodbyeWriter();
}
