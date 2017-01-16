package Factory_Method.Example_1;

/**
 * Created by den on 2017-01-14.
 */
public class Director {
    CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    Car  buildCar(){
        builder.createCar();
        builder.setName();
        builder.setWeight();
        builder.setPrice();
        Car car = builder.getCar();
        return car;
    }
}
