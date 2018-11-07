package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Factory provider
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (FactoryType.TWO_D_SHAPE_FACTORY == factoryType) {
            return new TwoDShapeFactory();
        } else if (FactoryType.THREE_D_SHAPE_FACTORY == factoryType) {
            return new ThreeDShapeFactory();
        }
        return null;
    }
}
