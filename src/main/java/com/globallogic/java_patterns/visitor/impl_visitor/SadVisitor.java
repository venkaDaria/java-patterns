package com.globallogic.java_patterns.visitor.impl_visitor;

import com.globallogic.java_patterns.visitor.SightVisitor;
import com.globallogic.java_patterns.visitor.impl.ArtGallery;
import com.globallogic.java_patterns.visitor.impl.Cinema;
import com.globallogic.java_patterns.visitor.impl.Museum;
import com.globallogic.java_patterns.visitor.impl.Theater;

public class SadVisitor implements SightVisitor {

    @Override
    public void visit(final Museum museum) {
        System.out.println("I don't like museums");
    }

    @Override
    public void visit(final Theater theater) {
        System.out.println("I don't like theaters");
    }

    @Override
    public void visit(final Cinema cinema) {
        System.out.println("I don't like cinemas");
    }

    @Override
    public void visit(final ArtGallery artGallery) {
        System.out.println("I don't like art galleries");
    }
}
