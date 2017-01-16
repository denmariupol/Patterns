package Example_1;

import Example_1.BMW;
import Example_1.abstr.Car;
import Example_1.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class BMWFactory implements Factory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
