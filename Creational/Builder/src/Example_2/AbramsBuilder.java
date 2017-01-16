package Example_2;

import Example_1.Weight;

/**
 * Created by den on 2017-01-14.
 */
public class AbramsBuilder extends TankBuilder {
    @Override
    void setName() {
        tank.setName("Abrams");
    }

    @Override
    void setWeight() {
        tank.setWeight(Weight.HEAVY);
    }

    @Override
    void setPrice() {
        tank.setPrice(8000000);
    }
}
