package factory;

import abstr.Pizza;
import abstr.PizzaStore;
import pizza.NYStyleCheesePizza;
import pizza.NYStylePepperoniPizza;

/**
 * Created by den on 2017-01-06.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }

    }
}
