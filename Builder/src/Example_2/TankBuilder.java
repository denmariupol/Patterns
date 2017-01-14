package Example_2;

/**
 * Created by den on 2017-01-14.
 */
public abstract class TankBuilder {
    Tank tank;

    public void createTank(){
        tank = new Tank();
    }

    abstract void setName();
    abstract void setWeight();
    abstract void setPrice();

    Tank getTank(){
        return tank;
    }
}
