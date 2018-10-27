package com.eprogrammerz.examples.gof.patterns.abstractfactory.drawio;

/**
 * Factory provider
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String name) {
        if (name.equals("2DShapeFactory")) {
            return new TwoDShapeFactory();
        } else if (name.equals("3DShapeFactory")) {
            return new ThreeDShapeFactory();
        }
        return null;
    }
}
