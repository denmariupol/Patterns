package Example_2;

import Example_2.abstr.Car;
import Example_2.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory =Factory.createFactory("BMW");
        Car car = factory.createCar();
        car.drive();

        Factory factory1 =Factory.createFactory("vOlVo");
        Car car1 = factory1.createCar();
        car1.drive();
    }


}
