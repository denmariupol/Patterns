package Example_2;

import Example_2.abstr.Car;

/**
 * Created by den on 2017-01-14.
 */
public class Volvo implements Car {
    @Override
    public void drive() {
        System.out.println("Volvo is driving");
    }
}
