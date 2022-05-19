/**
 * Created by Jorge Ezequiel Garcia Lopez
 * Student ID: 200863135
 * Software Engineering Student at CSUSM Spring 2022
 * Software Engineering 471 Software Architecture
 * Professor Simon Fan
 */
package YouCanMixApp.DecoratorPattern;

public class bevMain {
    public static void main(String[] args) {
        Beverage bev = new MoscowMule();
        System.out.println(bev.getName());
        System.out.println(bev.getIngredients());

        bev = new Alcohol(bev, "2 oz Vodka");
        System.out.println(bev.getName());
        System.out.println(bev.getIngredients());

        bev = new Lime(bev, "lime wedge, for garnish");
        System.out.println(bev.getName());
        System.out.println(bev.getIngredients());
    }
}
