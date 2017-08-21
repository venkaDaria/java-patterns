package com.globallogic.java_patterns.adapter.impl;

import com.globallogic.java_patterns.adapter.Lighter;
import com.globallogic.java_patterns.adapter.MagicWand;
import com.globallogic.java_patterns.adapter.Waterer;

// Class Adapter
public class MagicArtifact extends MagicWand implements Lighter, Waterer {

    @Override
    public void light() {
        castLumos();
    }

    @Override
    public void water() {
        castAguamenti();
    }
}
