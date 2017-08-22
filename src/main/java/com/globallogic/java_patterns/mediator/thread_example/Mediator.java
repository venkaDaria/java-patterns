package com.globallogic.java_patterns.mediator.thread_example;

public class Mediator {

    private boolean slotFull;

    private int number;

    public synchronized void storeMessage(int num) {
        // no room for another message
        while (slotFull) try {
            wait();
        } catch (InterruptedException e) {
            break;
        }

        slotFull = true;
        number = num;

        notifyAll();
    }

    public synchronized int retrieveMessage() {
        // no message to retrieve
        while (!slotFull) try {
            wait();
        } catch (InterruptedException e) {
            break;
        }

        slotFull = false;
        notifyAll();

        return number;
    }
}


