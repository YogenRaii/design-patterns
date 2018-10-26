package design_patterns.composite_pattern.example;

/**
 * Leaf
 */
public class Circle implements Graphic {

    //Draw Circle
    @Override
    public void draw() {
        System.out.println("Circle Drawn.");
    }
}
