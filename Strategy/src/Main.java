import abstr.Duck;
import Behavior.FlyBehavior.NoFly;
import Behavior.QuackBehavior.Quack;
import entities.MallardDuck;

/**
 * Created by den on 2017-01-03.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new NoFly());
        mallard.setQuackBehavior(new Quack());
        mallard.peformFly();
        mallard.performQuack();
        mallard.Display();
    }
}
