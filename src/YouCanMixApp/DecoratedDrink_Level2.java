package YouCanMixApp;

public class DecoratedDrink_Level2 extends AbstractDrinkWrapper{
    private String drinkName;
    private String ingredients;
    private String quantities;
    private int rating;
    private boolean containsAlchohol;
    private double alchoholContent;


    //DEFAULT CONSTRUCTOR
    public DecoratedDrink_Level2() {
        super();
        this.drinkName = ""; // setting default values as empty
        this.ingredients = "";
        this.quantities = "";
        this.rating = 0;
        this.alchoholContent = 0;
    }

    //CONSTRUCTOR
    public DecoratedDrink_Level2(String theme, String drinkName, String ingredients, String quantities, int rate) {
        if (drinkName != null && ingredients != null && quantities != null)
        {
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

    public boolean isContainsAlchohol() {
        return containsAlchohol;
    }

    public void setContainsAlchohol(boolean containsAlchohol) {
        this.containsAlchohol = containsAlchohol;
    }

    public double getAlchoholContent() {
        return alchoholContent;
    }

    public void setAlchoholContent(int alchoholContent) {
        if(containsAlchohol) {
            this.alchoholContent = alchoholContent;
        }
        else{
            this.alchoholContent = 0;
        }
    }
}
