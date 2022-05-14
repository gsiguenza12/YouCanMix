package YouCanMixApp;

interface AbstractDrinkIF {
    public abstract String getDrinkName();
    public abstract String getIngredients();
    public abstract String getQuantities();
    public abstract int getRating();
    public abstract void setRating(int r);
}
