package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}
