package com.eprogrammerz.examples.gof.patterns.factory.abstract_factory;

/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
    abstract GeometricShape getShape(String name);
}
