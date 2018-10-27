package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete factory
 */
public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(String name) {
        if (name.equals("sphere")) {
            return new Sphere();
        }
        return null;
    }
}
