package com.eprogrammerz.examples.gof.patterns.composite.drawio;

/**
 * Leaf
 */
public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn.");
    }
}
