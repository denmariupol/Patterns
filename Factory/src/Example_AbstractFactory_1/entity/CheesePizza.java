package Example_AbstractFactory_1.entity;

import Example_AbstractFactory_1.abstr.Pizza;
import Example_AbstractFactory_1.abstr.PizzaIngredientFactory;


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
