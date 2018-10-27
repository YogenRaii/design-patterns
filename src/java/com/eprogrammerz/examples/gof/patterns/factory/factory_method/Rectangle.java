package com.eprogrammerz.examples.gof.patterns.factory.factory_method;

/**
 * Concrete Product
 */
public class Rectangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}
