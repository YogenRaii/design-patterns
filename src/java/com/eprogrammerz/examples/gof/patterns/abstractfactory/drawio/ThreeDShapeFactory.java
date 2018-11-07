package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Concrete factory
 */
public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType name) {
        if (ShapeType.SPHERE == name) {
            return new Sphere();
        }
        return null;
    }
}
