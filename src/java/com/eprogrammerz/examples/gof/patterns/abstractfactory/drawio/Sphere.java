package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }
}
