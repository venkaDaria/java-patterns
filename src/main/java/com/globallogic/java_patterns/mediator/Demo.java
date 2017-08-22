package com.globallogic.java_patterns.mediator;

import com.globallogic.java_patterns.mediator.thread_example.Consumer;
import com.globallogic.java_patterns.mediator.thread_example.Mediator;
import com.globallogic.java_patterns.mediator.thread_example.Producer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        List<Thread> producerList = new ArrayList<>();
        Mediator mb = new Mediator();

        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));

        System.out.println("Press ENTER for exit");
        producerList.forEach(Thread::start);

        Scanner sc = new Scanner(System.in);
        for (String exit; true; ) {
            exit = sc.nextLine();

            if (exit.equals(""))
                break;
        }

        producerList.forEach(Thread::interrupt);

        System.out.println("Interrupted all");
    }
}
