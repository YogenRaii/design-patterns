package design_patterns.factory.factory_method;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line Drawn.");
    }
}
