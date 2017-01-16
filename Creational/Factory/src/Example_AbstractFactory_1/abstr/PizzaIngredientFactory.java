package Example_AbstractFactory_1.abstr;

/**
 * Created by den on 2017-01-10.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams creteClam();
}
