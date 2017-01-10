package pizza;

import abstr.Pizza;

/**
 * Created by den on 2017-01-06.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dough = "Extra NY Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Pepperoni Best Cheese");
    }
}
