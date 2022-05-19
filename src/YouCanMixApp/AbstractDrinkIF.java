package YouCanMixApp;

/**
 * The Interface to be used with the Decorator (Wrapper): decorating an object with add-on features.
 */
interface AbstractDrinkIF {
    public abstract String getDrinkName();
    public abstract String getIngredients();
    public abstract String getQuantities();
    public abstract int getRating();
    public abstract void setRating(int r);
}
