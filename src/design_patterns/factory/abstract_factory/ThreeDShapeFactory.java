package design_patterns.factory.abstract_factory;

/**
 * Concrete factory
 */
public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(String name) {
        if (name.equals("sphere")){
            return new Sphere();
        }
        return null;
    }
}
