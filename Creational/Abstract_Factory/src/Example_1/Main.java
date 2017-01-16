package Example_1;

import Example_1.abstr.Pizza;
import Example_1.abstr.PizzaStore;
import Example_1.factory.NYPizzaStore;

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
