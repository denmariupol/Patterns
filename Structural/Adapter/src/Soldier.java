/**
 * Created by den on 2017-01-16.
 */
public class Soldier extends Loader implements Ammunition {
    @Override
    public void getBullets() {
        bullets();
    }

    @Override
    public void getGrenades() {
        grenades();
    }

    @Override
    public void getRifle() {
        rifle();
    }

    @Override
    public void getArmour() {
        armour();
    }
}
