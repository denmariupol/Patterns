package Factory_Method.Example_1;

/**
 * Created by den on 2017-01-14.
 */
public class Runner {
    public static void main(String[] args) {
        Director director = new Director(new VolvoBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
