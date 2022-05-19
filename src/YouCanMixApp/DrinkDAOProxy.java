package YouCanMixApp;

public class DrinkDAOProxy implements DrinkDAO{

    private DrinkManagerDAO realDrinkDAO = new DrinkManagerDAO();

    @Override
    public boolean insertDrink(Drink currentDrink) throws ClassNotFoundException {
        return realDrinkDAO.insertDrink(currentDrink);
    }

    @Override
    public boolean insertRate(Drink currentDrink, int r) throws ClassNotFoundException {
        return realDrinkDAO.insertRate(currentDrink, r);
    }

    @Override
    public Drink[] getDrinks(String ES) throws ClassNotFoundException {
        return realDrinkDAO.getDrinks(ES);
    }

    @Override
    public int getCurrentSize() {
        return realDrinkDAO.getCurrentSize();
    }
}
