package Example_2;

import Example_2.abstr.Car;
import Example_2.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class BMWFactory extends Factory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
