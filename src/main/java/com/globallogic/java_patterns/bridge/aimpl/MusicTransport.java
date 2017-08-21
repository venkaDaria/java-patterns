package com.globallogic.java_patterns.bridge.aimpl;

import com.globallogic.java_patterns.bridge.Movable;
import com.globallogic.java_patterns.bridge.Transport;

public class MusicTransport extends Transport {

    public MusicTransport(final Movable bridge) {
        super(bridge);
    }

    public void move() {
        super.move();
        System.out.println("with beautiful song");
    }
}
