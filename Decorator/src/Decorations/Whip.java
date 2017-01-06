package Decorations;

import abstr.Beverage;
import abstr.Decorator;

/**
 * Created by den on 2017-01-05.
 */
public class Whip extends Decorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public int getSize(){
        return beverage.getSize();
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case 1:
                return 0.15 + beverage.cost();
            case 2:
                return 0.20 + beverage.cost();
            case 3:
                return 0.25 + beverage.cost();
            default:
                return 0;
        }
    }
}

