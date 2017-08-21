package com.globallogic.java_patterns.composite;

import com.globallogic.java_patterns.composite.exception.BoxOverflowException;
import com.globallogic.java_patterns.composite.impl.Box;
import com.globallogic.java_patterns.composite.impl.Toy;

public class Demo {

    public static void main(String[] args) throws BoxOverflowException {
        Box box = new Box(7);

        box.add(new Toy("Tom"));
        box.add(new Toy("Jill"));

        Box subbox = new Box(4);
        subbox.add(new Toy("Chris"));
        box.add(subbox);

        box.print();
        System.out.println(box.getCount());
        System.out.println(box.getEmptyPlaces());

        box.add(new Box(3));
    }
}
