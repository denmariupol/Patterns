package abstr;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

/**
 * Created by den on 2017-01-03.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void Swim(){
        System.out.println("All Ducks are SWIMMING!!!");
    }

    public void performQuack(){
        quackBehavior.Quack();
    }

    public void peformFly(){
        flyBehavior.Fly();
    }
    public abstract void Display();
}
