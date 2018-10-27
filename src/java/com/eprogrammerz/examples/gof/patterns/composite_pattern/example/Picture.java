package com.eprogrammerz.examples.gof.patterns.composite_pattern.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Composite
 */
public class Picture implements Graphic {
    //Collection of child graphic
    private Collection<Graphic> graphics = new ArrayList<Graphic>();

    @Override
    public void draw() {
        for (Graphic graphic:graphics){
            graphic.draw();
        }
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic){
        graphics.add(graphic);
    }

    //Removes the child graphic from the composition.
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }
}
