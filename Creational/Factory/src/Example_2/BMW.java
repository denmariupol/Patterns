package Example_2;

import Example_2.abstr.Car;

/**
 * Created by den on 2017-01-14.
 */
public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("BMV is driving");
    }
}
