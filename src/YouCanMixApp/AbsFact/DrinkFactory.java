package YouCanMixApp.AbsFact;

public class DrinkFactory implements IF_DrinkFactory {

    public IF_Base createBase() {
        return new Base();
    }

    public IF_Ingredient createIngredient() {
        return new Ingredient();

    }
}
