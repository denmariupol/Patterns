import Decorations.Mocha;
import Decorations.Whip;
import abstr.Beverage;
import entity.DarkRoast;
import entity.Decaf;
import entity.Espresso;

/**
 * Created by den on 2017-01-05.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(3);
//        beverage.setSize(1);
        System.out.println(beverage.getDescription() + " $"+ beverage.cost());

        Beverage beverage1 = new Decaf(1);
//        beverage1.setSize(2);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " $"+ beverage1.cost());

        Beverage beverage2 = new DarkRoast(2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $"+ beverage2.cost());
    }
}
