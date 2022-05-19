/**
 * Created by Jorge Ezequiel Garcia Lopez
 * Student ID: 200863135
 * Software Engineering Student at CSUSM Spring 2022
 * Software Engineering 471 Software Architecture
 * Professor Simon Fan
 */
package YouCanMixApp.DecoratorPattern;

public abstract class beverageDecorator extends Beverage {
    Beverage beverage;

    public abstract String getName();

    public abstract String getIngredients();
}
