package Example_2;

/**
 * Created by den on 2017-01-14.
 */
public class Builder {
    TankBuilder builder;

    public Builder(TankBuilder builder) {
        this.builder = builder;
    }

    Tank buildTank(){
        builder.createTank();
        builder.setName();
        builder.setWeight();
        builder.setPrice();

        return builder.getTank();
    }
}
