package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete product
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}
