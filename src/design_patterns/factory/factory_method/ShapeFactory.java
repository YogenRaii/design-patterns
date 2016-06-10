package design_patterns.factory.factory_method;

import com.sun.istack.internal.Nullable;

/**
 * Concrete Product
 */
public abstract class ShapeFactory {
    public static GeometricShape getShape(String name){
        if(name.equals("line")){
            return new Line();
        }else if (name.equals("circle")){
            return new Circle();
        }else if (name.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
