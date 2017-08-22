package com.globallogic.java_patterns.visitor;

import com.globallogic.java_patterns.visitor.impl.*;
import com.globallogic.java_patterns.visitor.impl_visitor.HappyVisitor;
import com.globallogic.java_patterns.visitor.impl_visitor.SadVisitor;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Sight[] sights = {
                new ArtGallery(),
                new Museum(),
                new Cinema(),
                new Theater(),
                new UnknownSight()
        };

        HappyVisitor hv = new HappyVisitor();
        SadVisitor sv = new SadVisitor();

        Arrays.stream(sights).forEach(sight -> {
            sight.accept(hv);
            sight.accept(sv);
        });
    }
}
