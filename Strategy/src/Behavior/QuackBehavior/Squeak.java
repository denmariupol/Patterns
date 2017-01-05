package Behavior.QuackBehavior;

import interfaces.QuackBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Rubber ducks are squeacks!!!");
    }
}
