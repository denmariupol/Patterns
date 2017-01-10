import abstr.Pizza;
import abstr.PizzaStore;
import factory.ChicagoStylePizzaStore;
import factory.NYStylePizzaStore;

/**
 * Created by den on 2017-01-06.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+ pizza.getName()+"\n");

        pizza = chStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a "+ pizza.getName()+"\n");
    }
}
