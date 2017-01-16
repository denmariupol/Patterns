package Behavior.FlyBehavior;

import interfaces.FlyBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class WingsFly implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("Fly With Wings");
    }
}
