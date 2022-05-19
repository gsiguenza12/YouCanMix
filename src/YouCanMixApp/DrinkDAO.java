package YouCanMixApp;

public interface DrinkDAO {
    public boolean insertDrink(Drink currentDrink)throws ClassNotFoundException;
    public boolean insertRate(Drink currentDrink, int r) throws ClassNotFoundException;
    public Drink[] getDrinks(String ES)throws ClassNotFoundException;
    public int getCurrentSize();
}
