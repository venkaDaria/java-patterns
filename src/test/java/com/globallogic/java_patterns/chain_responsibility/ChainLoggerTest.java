package com.globallogic.java_patterns.chain_responsibility;

import com.globallogic.java_patterns.WriterTest;
import com.globallogic.java_patterns.chain_responsibility.impl.ConsoleLogger;
import com.globallogic.java_patterns.chain_responsibility.impl.ErrorLogger;
import com.globallogic.java_patterns.chain_responsibility.impl.FileLogger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainLoggerTest extends WriterTest {

    private AbstractLogger loggerChain;

    @Before
    public void getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(Level.ERROR);
        AbstractLogger fileLogger = new FileLogger(Level.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(Level.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        loggerChain = errorLogger;
    }

    @Test
    public void logMessageTest() {
        loggerChain.logMessage(Level.INFO, "This is an information.");

        loggerChain.logMessage(Level.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(Level.ERROR, "This is an error information.");

        assertEquals("Standard Console::Logger: This is an information." + System.lineSeparator()
                + "File::Logger: This is an debug level information." + System.lineSeparator()
                + "Standard Console::Logger: This is an debug level information." + System.lineSeparator()
                + "File::Logger: This is an error information." + System.lineSeparator()
                + "Standard Console::Logger: This is an error information."
                + System.lineSeparator(), outContent.toString());

        assertEquals("Error Console::Logger: This is an error information."
                + System.lineSeparator(), errContent.toString());
    }
}
