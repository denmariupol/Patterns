package Behavior.QuackBehavior;

import interfaces.QuackBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class Quack implements QuackBehavior {
    @Override
    public void Quack() {
        System.out.println("Usual duck are squack!!!");
    }
}
