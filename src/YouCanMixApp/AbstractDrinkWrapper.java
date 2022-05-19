package YouCanMixApp;

import java.io.Serializable;

/**
 * The abstract drink wrapper class. Enforces the contract to implement common drink methods, but declared abstract to allow objects to be expanded upon.
 * Since we have only two decorated objects this could be removed and it's responsibilities merged with the concrete Drink class, however we decided
 * to keep this structure as we would like to allow extension in the future.
 */
public abstract class AbstractDrinkWrapper implements AbstractDrinkIF, Serializable {

    private AbstractDrinkIF wrappee; // not used

    @Override
    public abstract String getDrinkName();

    @Override
    public abstract String getIngredients();

    @Override
    public abstract String getQuantities();

    @Override
    public abstract int getRating();

    @Override
    public abstract void setRating(int r);
}
