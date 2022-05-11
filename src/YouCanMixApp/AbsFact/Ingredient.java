package YouCanMixApp.AbsFact;

public class Ingredient implements IF_Ingredient {

    String iname;
    int iquantity;

    Ingredient() {
        //this.iname = iname;
        //this.iquantity = iquantity;
    }

    public Ingredient createIngredient() {
        //will return the result of a getString function
        return new Ingredient();
    }
}
