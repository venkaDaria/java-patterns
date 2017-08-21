package com.globallogic.java_patterns.factory_method;

import com.globallogic.java_patterns.factory_method.impl.Chamomile;
import com.globallogic.java_patterns.factory_method.impl.Dandelion;
import com.globallogic.java_patterns.factory_method.impl.Rose;

public enum FlowerName {
    ROSE {
        @Override
        public Flower getInstance() {
            return new Rose();
        }
    },

    DANDELION {
        @Override
        public Flower getInstance() {
            return new Dandelion();
        }
    },

    CHAMOMILE {
        @Override
        public Flower getInstance() {
            return new Chamomile();
        }
    };

    // way with enum (FactoryMethod), can create Flower#getInstance method that calls this
    public abstract Flower getInstance();
}
