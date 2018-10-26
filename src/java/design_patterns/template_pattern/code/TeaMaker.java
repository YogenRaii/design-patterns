package design_patterns.template_pattern.code;

/**
 * We can extend DrinkMaker class in order
 * to create actual drink maker.
 */
public class TeaMaker extends DrinkMaker {
    /* Implementation of necessary concrete methods */
    @Override
    void boilLiquid() {
        System.out.println("Boiling water.");
    }

    @Override
    void addIngredients() {
        System.out.println("Tea and sugar added.");
    }
}
