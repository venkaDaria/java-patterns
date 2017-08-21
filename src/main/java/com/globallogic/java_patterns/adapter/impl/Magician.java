package com.globallogic.java_patterns.adapter.impl;

import com.globallogic.java_patterns.adapter.Lighter;
import com.globallogic.java_patterns.adapter.MagicWand;
import com.globallogic.java_patterns.adapter.Waterer;

// Object Adapter
public class Magician implements Lighter, Waterer {

    private final MagicWand wand = new MagicWand();

    @Override
    public void light() {
        wand.castLumos();
    }

    @Override
    public void water() {
        wand.castAguamenti();
    }
}
