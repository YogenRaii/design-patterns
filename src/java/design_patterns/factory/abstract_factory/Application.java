package design_patterns.factory.abstract_factory;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        //drawing 2D shape
        AbstractFactory factory = FactoryProvider.getFactory("2DShapeFactory");
        if (factory == null){
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
        //getting shape using factory obtained
        GeometricShape shape = factory.getShape("line");
        if(shape != null){
            shape.draw();
        }else {
            System.out.println("Shape with given name doesn't exist.");
        }

        //drawing 3D shape
        factory = FactoryProvider.getFactory("3DShapeFactory");
        if (factory == null){
            System.out.println("Factory for given name doesn't exist.");
            System.exit(1);
        }
        //getting shape using factory obtained
        shape = factory.getShape("sphere");
        if(shape != null){
            shape.draw();
        }else {
            System.out.println("Shape with given name doesn't exist.");
        }
    }
}
