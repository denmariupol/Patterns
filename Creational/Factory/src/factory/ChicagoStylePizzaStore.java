package factory;

import abstr.Pizza;
import abstr.PizzaStore;
import pizza.ChicagoStyleCheesePizza;
import pizza.ChicagoStylePepperoniPizza;

/**
 * Created by den on 2017-01-06.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type){
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
