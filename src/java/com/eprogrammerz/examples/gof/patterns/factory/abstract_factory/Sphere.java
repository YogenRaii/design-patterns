package com.eprogrammerz.examples.gof.patterns.factory.abstract_factory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }
}
