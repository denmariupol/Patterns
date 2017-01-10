package AbstractFactory.entity;

import AbstractFactory.abstr.Pizza;
import AbstractFactory.abstr.PizzaIngredientFactory;


/**
 * Created by den on 2017-01-10.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.creteClam();
    }
}
