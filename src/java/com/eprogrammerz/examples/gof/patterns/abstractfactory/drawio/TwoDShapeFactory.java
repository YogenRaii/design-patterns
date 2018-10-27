package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete factory
 */
public class TwoDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(String name) {
        if (name.equals("line")) {
            return new Line();
        } else if (name.equals("circle")) {
            return new Circle();
        }
        return null;
    }
}
