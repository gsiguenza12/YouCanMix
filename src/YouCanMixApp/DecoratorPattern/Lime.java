/**
 * Created by Jorge Ezequiel Garcia Lopez
 * Student ID: 200863135
 * Software Engineering Student at CSUSM Spring 2022
 * Software Engineering 471 Software Architecture
 * Professor Simon Fan
 */
package YouCanMixApp.DecoratorPattern;

public class Lime extends beverageDecorator {
    private String type;
    public Lime(Beverage beverage, String type) { this.beverage = beverage; this.name = beverage.getName(); this.type = type;}

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getIngredients() {
        return beverage.getIngredients() + ", " + type;
    }
}
