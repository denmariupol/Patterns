package AbstractFactory.factory;

import AbstractFactory.abstr.*;
import AbstractFactory.entity.*;

/**
 * Created by den on 2017-01-10.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies [] veggies = new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams creteClam() {
        return new FreshClams();
    }
}
