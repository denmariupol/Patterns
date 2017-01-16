package Factory_Method.Example_1;

/**
 * Created by den on 2017-01-14.
 */
public class VolvoBuilder extends CarBuilder {
    @Override
    void setName() {
        car.setName("Volvo");
    }

    @Override
    void setWeight() {
        car.setWeight(Weight.LIGHT);
    }

    @Override
    void setPrice() {
        car.setPrice(1000);
    }
}
