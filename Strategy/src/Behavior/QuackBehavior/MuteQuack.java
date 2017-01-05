package Behavior.QuackBehavior;

import interfaces.QuackBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Silent Ducks are don't squacks!!!");
    }
}
