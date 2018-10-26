package design_patterns.factory.abstract_factory;

import design_patterns.factory.factory_method.*;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Sphere drawn.");
    }
}
