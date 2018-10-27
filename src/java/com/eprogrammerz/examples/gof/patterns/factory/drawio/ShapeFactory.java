package com.eprogrammerz.examples.gof.patterns.factory.drawio;

/**
 * Concrete Product
 */
public abstract class ShapeFactory {
    public static GeometricShape getShape(String name) {
        if (name.equals("line")) {
            return new Line();
        } else if (name.equals("circle")) {
            return new Circle();
        } else if (name.equals("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
