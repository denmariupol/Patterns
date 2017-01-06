package entity;

import abstr.Beverage;

/**
 * Created by den on 2017-01-05.
 */
public class Espresso extends Beverage {
    Beverage beverage;

    public Espresso(int s) {
        description = "Espresso";
        this.beverage = this;
        super.size = s;
    }

    @Override
    public double cost() {
        switch (size) {
            case 1:
                return 0.90;
            case 2:
                return 1.425;
            case 3:
                return 1.99;
            default:
                return 0;
        }
    }
}

