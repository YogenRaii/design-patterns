package com.eprogrammerz.examples.gof.patterns.template_pattern.code;

/**
 * This is an abstract class that is common to
 * other classes.
 */
public abstract class DrinkMaker {
    /* A template method : */
    public final void makeDrink(){
        System.out.println("Drink will be ready in a while.");
        System.out.println("--------------------------------");
        boilLiquid();
        addIngredients();
        shakeIt();
    }
    abstract void boilLiquid();
    abstract void addIngredients();

    protected void shakeIt(){
        System.out.println("Shake it well. Drink is ready.");
        System.out.println("--------------------------------");
    }
}
