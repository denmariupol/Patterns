package Example_1;

import Example_1.abstr.Car;
import Example_1.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class VolvoFactory implements Factory {
    @Override
    public Car createCar() {
        return new Volvo();
    }
}
