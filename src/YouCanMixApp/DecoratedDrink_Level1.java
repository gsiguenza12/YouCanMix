package YouCanMixApp;

/**
 * concrete wrapper class that extends the behavior of the methods inherited from the AbstractWrapper class in whatever way that is needed.
 */
public class DecoratedDrink_Level1 extends AbstractDrinkWrapper {
    private String drinkName;
    private String ingredients;
    private String quantities;
    private int rating;
    private String theme;

    //DEFAULT CONSTRUCTOR
    public DecoratedDrink_Level1() {
        super();
        this.drinkName = ""; // setting default values as empty
        this.ingredients = "";
        this.quantities = "";
        this.rating = 0;
        this.theme = "";
    }

    //CONSTRUCTOR

    /**
     * @param decoratee the Drink object to be decorated
     * @param theme a String representing the theme [extended functionality - decorator(Wrapper)]
     */
    public DecoratedDrink_Level1(Drink decoratee, String theme) {
        // safe extraction of decoratable object drink instance vars
        String drinkName = decoratee.getDrinkName();
        String ingredients = decoratee.getIngredients();
        String quantities = decoratee.getQuantities();
        int rating = decoratee.getRating();

        if (drinkName != null && ingredients != null && quantities != null)
        {
            this.theme = theme;
            this.drinkName = drinkName;
            this.ingredients = ingredients;
            this.quantities = quantities;
            this.rating = rating;
        }

    }

    public String getDrinkName() {
        return this.drinkName;
    }
    public String getIngredients() {
        return this.ingredients;
    }
    public String getQuantities() {
        return this.quantities;
    }
    public int getRating() {
        return this.rating;
    }
    public void setRating(int r) {
        this.rating = r;
    }
    public String getTheme() {return theme;}
    public void setTheme(String theme) {this.theme = theme;}
}
