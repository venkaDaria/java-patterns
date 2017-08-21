package com.globallogic.java_patterns.facade.impl;

import com.globallogic.java_patterns.facade.Cutlery;

public class Knife implements Cutlery {

    @Override
    public void put() {
        System.out.println("Put a knife");
    }
}
