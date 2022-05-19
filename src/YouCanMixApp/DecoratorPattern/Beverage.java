/**
 * Created by Jorge Ezequiel Garcia Lopez
 * Student ID: 200863135
 * Software Engineering Student at CSUSM Spring 2022
 * Software Engineering 471 Software Architecture
 * Professor Simon Fan
 */
package DecoratorPattern;

public abstract class Beverage {
    String name = "Unknown Beverage";
    String ingredients = "Ingredients not available";

    public String getName() {
        return name;
    }
    public String getIngredients() {
        return ingredients;
    }
}
