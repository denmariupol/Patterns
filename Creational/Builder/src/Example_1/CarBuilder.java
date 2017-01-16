package Example_1;

/**
 * Created by den on 2017-01-14.
 */
public abstract class CarBuilder {
    Car car;

    public void createCar(){
        car = new Car();
    }

    abstract void setName();
    abstract void setWeight();
    abstract void setPrice();

    Car getCar(){
        return car;
    }
}
