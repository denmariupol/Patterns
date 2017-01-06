package entity;

import abstr.Beverage;

/**
 * Created by den on 2017-01-05.
 */
public class DarkRoast extends Beverage {
    Beverage beverage;
    public DarkRoast(int size){
        description = "Dark Roast";
//        this.beverage = this;

    }
    @Override
    public double cost() {
        switch (this.getSize()) {
            case 1:
                return 0.69;
            case 2:
                return 0.99;
            case 3:
                return 1.29;
            default:
                return 0;
        }
    }
}
