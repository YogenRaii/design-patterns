package com.eprogrammerz.examples.gof.patterns.template_pattern.code;

/**
 * Created by ${YogenRai} on 4/4/2016.
 */
public class CoffeeMaker extends DrinkMaker {
    /* Implementation of necessary concrete methods */
    @Override
    void boilLiquid() {
        System.out.println("Boiling Milk.");
    }

    @Override
    void addIngredients() {
        System.out.println("Coffee and Sugar added.");
    }
}
