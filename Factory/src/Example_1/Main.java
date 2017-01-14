package Example_1;

import Example_1.abstr.Car;
import Example_1.abstr.Factory;

/**
 * Created by den on 2017-01-14.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory =createFactory("BMW");
        Car car = factory.createCar();

        car.drive();
    }

    public static Factory createFactory(String factory){
        if(factory.equalsIgnoreCase("bmw"))
            return new BMWFactory();
        else if (factory.equalsIgnoreCase("volvo"))
            return new VolvoFactory();
        else
            return null;
    }
}
