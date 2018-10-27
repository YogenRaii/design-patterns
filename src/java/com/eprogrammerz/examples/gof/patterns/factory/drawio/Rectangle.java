package com.eprogrammerz.examples.gof.patterns.factory.drawio;

/**
 * Concrete Product
 */
public class Rectangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}
