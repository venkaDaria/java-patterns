package com.globallogic.java_patterns.mediator.thread_example;

public class Consumer implements Runnable {

    private static int NUM = 1;
    private final Mediator med;
    private final int id;

    public Consumer(Mediator m) {
        med = m;
        id = NUM++;
    }

    @Override
    public void run() {
        while (true) try {
            System.out.print("c" + id + "-" + med.retrieveMessage() + "  ");
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("c" + id);
            break;
        }
    }
}
