package YouCanMixApp;

public class Drink {
    private String drinkName;
    private String ingredients;
    private String quantities;
    private int rating;
    
    //DEFAULT CONSTRUCTOR
    public Drink(String drink_name, String ingredients, String quantity, int rating) {
    	super();
    	this.drinkName = "";
        this.ingredients = "";
        this.quantities = "";
        this.rating = 0;
    }

    //CONSTRUCTOR
    /*public Drink(String drinkName, String ingredients, String quantities, int rate) {
        if (drinkName != null && ingredients != null && quantities != null)
        {
            this.drinkName = drinkName;
            this.ingredients = ingredients;
            this.quantities = quantities;
            this.rating = rate;
        }

    }*/
    
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

    /*public void setRating(int r) {
    	this.rating = r;
    }*/

    private Drink(DrinkBuilder builder){
        // blah
        this.drinkName = builder.drinkName;
        this.ingredients = builder.ingredients;
        this.quantities = builder.quantities;
        this.rating = builder.rating;
    }

    //drinkBuilder class
    public static class DrinkBuilder{


        private String drinkName;
        private String ingredients;
        private String quantities;
        private int rating;

        public DrinkBuilder(String drinkName, String ingredients, String quantities, int rating){
            this.drinkName = drinkName;
            this.ingredients = ingredients;
            this.quantities = quantities;
            this.rating = rating;
        }

        /*public static Drink build(String text, String fullIngredient, String fullQuantity, int i) {

        }*/

        /*public DrinkBuilder setDrinkName(String name){
            this.drinkName = name;
        }*/

        public Drink build(){
            return new Drink(this);
        }


    }
}
