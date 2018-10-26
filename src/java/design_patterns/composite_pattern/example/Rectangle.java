package design_patterns.composite_pattern.example;

/**
 * Leaf
 */
public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn.");
    }
}
