package com.globallogic.java_patterns.mediator.thread_example;

public class Producer implements Runnable {

    private static int NUM = 1;
    private final Mediator med;
    private final int id;

    public Producer(Mediator m) {
        med = m;
        id = NUM++;
    }

    @Override
    public void run() {
        int num;

        while (true) try {
            num = (int) (Math.random() * 100);

            med.storeMessage(num);
            System.out.print("p" + id + "-" + num + "  ");

            Thread.sleep(1);
        } catch (InterruptedException ex) {
            System.out.println("p" + id);
            break;
        }
    }
}
