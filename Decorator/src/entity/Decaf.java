package entity;

import abstr.Beverage;

/**
 * Created by den on 2017-01-05.
 */
public class Decaf extends Beverage {
    Beverage beverage;

    public Decaf(int s){
        description = "Decaf";
        this.beverage = this;
        super.size = s;
    }
    @Override
    public double cost() {
        switch (size) {
            case 1:
                return 0.75;
            case 2:
                return 1.25;
            case 3:
                return 1.75;
            default:
                return 0;
        }
    }
}
