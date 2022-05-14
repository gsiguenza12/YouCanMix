package YouCanMixApp;

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
    public DecoratedDrink_Level1(String theme, String drinkName, String ingredients, String quantities, int rate) {
        if (drinkName != null && ingredients != null && quantities != null)
        {
            this.theme = theme;
            this.drinkName = drinkName;
            this.ingredients = ingredients;
            this.quantities = quantities;
            this.rating = rate;
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
