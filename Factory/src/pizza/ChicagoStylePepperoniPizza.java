package pizza;

import abstr.Pizza;
import abstr.PizzaStore;

/**
 * Created by den on 2017-01-06.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Pepperoni Cheese");
    }

}
