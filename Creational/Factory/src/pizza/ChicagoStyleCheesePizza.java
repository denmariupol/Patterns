package pizza;

import abstr.Pizza;

/**
 * Created by den on 2017-01-06.
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
     protected void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}