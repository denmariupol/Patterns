package AbstractFactory;

import AbstractFactory.abstr.Pizza;
import AbstractFactory.abstr.PizzaStore;
import AbstractFactory.factory.NYPizzaStore;

/**
 * Created by den on 2017-01-10.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
    }
}
