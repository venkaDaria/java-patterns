package com.globallogic.java_patterns.visitor;

import com.globallogic.java_patterns.visitor.impl.ArtGallery;
import com.globallogic.java_patterns.visitor.impl.Cinema;
import com.globallogic.java_patterns.visitor.impl.Museum;
import com.globallogic.java_patterns.visitor.impl.Theater;

// examples: shopping cart etc.
public interface SightVisitor {

    // for UnknownSight
    default void visit(final Sight sight) {
        System.out.println("I don't know this sight: " + sight.getClass().getSimpleName());
    }

    void visit(final Museum museum);

    void visit(final Theater theater);

    void visit(final Cinema cinema);

    void visit(final ArtGallery artGallery);
}
