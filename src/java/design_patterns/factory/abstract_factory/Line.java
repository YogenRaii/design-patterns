package design_patterns.factory.abstract_factory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }
}
