package Example_2;

import Example_2.Volvo;
import Example_2.abstr.Car;
import Example_2.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class VolvoFactory extends Factory {
    @Override
    public Car createCar() {
        return new Volvo();
    }
}
