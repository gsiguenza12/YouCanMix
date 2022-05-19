package YouCanMixApp;

/**
 * concrete wrapper class that extends the behavior of the methods inherited from the AbstractWrapper class in whatever way that is needed.
 */
public class DecoratedDrink_Level2 extends AbstractDrinkWrapper{
    private String drinkName;
    private String ingredients;
    private String quantities;
    private int rating;
    private boolean containsAlcohol;
    private double alcoholContent;


    //DEFAULT CONSTRUCTOR
    public DecoratedDrink_Level2() {
        super();
        this.drinkName = ""; // setting default values as empty
        this.ingredients = "";
        this.quantities = "";
        this.rating = 0;
        this.alcoholContent = 0;
    }

    //CONSTRUCTOR

    /**
     * @param decoratee the Drink object to be decorated
     * @param alcoholContent a double for extended functionality of alchohol content, Decorator Wrapper
     */
    public DecoratedDrink_Level2(Drink decoratee, double alcoholContent) {
        // safe extraction of decoratable object drink instance vars
        String drinkName = decoratee.getDrinkName();
        String ingredients = decoratee.getIngredients();
        String quantities = decoratee.getQuantities();
        int rating = decoratee.getRating();
        
        if (drinkName != null && ingredients != null && quantities != null)
        {
            this.alcoholContent = alcoholContent;
            this.drinkName = drinkName;
            this.ingredients = ingredients;
            this.quantities = quantities;
            this.rating = rating;
            this.containsAlcohol = true;
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

    public boolean containsalcohol() {
        return containsAlcohol;
    }

    public void setContainsalcohol(boolean containsalcohol) {
        this.containsAlcohol = containsalcohol;
    }

    public double getalcoholContent() {
        return alcoholContent;
    }

    public void setalcoholContent(double alcoholContent) {
        if(containsAlcohol) {
            this.alcoholContent = alcoholContent;
        }
    }
}
