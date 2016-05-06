package design_patterns.template_pattern.code;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        DrinkMaker drinkMaker1 = new CoffeeMaker();
        drinkMaker1.makeDrink();

        DrinkMaker drinkMaker2 = new TeaMaker();
        drinkMaker2.makeDrink();
    }
}
