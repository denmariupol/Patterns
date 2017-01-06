package Decorations;

import abstr.Beverage;
import abstr.Decorator;

/**
 * Created by den on 2017-01-05.
 */
public class Mocha extends Decorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public int getSize(){
        return beverage.getSize();
    }
    @Override
    public double cost() {
        switch (getSize()) {
            case 1:
                return 0.1 + beverage.cost();
            case 2:
                return 0.15 + beverage.cost();
            case 3:
                return 0.2 + beverage.cost();
            default:
                return 0;
        }
    }
}
