package YouCanMixApp.AbsFact;

import static YouCanMixApp.AbsFact.IF_Base.name;

public class DrinkFactory implements IF_DrinkFactory {
    int rating; //used for rating drink
   String ing = "";

    public IF_Base Base() {
        return new Base();
    }
    public IF_Ingredient Ingredient() {
        return new Ingredient();
    }


/*
    public IF_Base createBase() {
        //return new Base();
    }

    public IF_Ingredient createIngredient() {
        //return new Ingredient();

    }
    }
    */

}
