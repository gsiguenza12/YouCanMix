package YouCanMixApp.AbsFact;

public interface IF_DrinkFactory {
    IF_Base createBase();//create Base (probably create the drink here?)

    IF_Ingredient createIngredient();//create Ingredient (and pass in the base here to
}
