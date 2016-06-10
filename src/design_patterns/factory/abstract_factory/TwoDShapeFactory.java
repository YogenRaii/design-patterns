package design_patterns.factory.abstract_factory;

/**
 * Concrete factory
 */
public class TwoDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(String name) {
        if(name.equals("line")){
            return new Line();
        }else if (name.equals("circle")){
            return new Circle();
        }
        return null;
    }
}
