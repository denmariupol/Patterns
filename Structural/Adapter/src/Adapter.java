/**
 * Created by den on 2017-01-15.
 */
public class Adapter extends Soldier implements Amunition {

    @Override
    public void addAmmo() {
        ammo();
    }

    @Override
    public void addGrenade() {
        grenade();
    }

    @Override
    public void addRifle() {
        riffle();
    }

    @Override
    public void addArmour() {
        armour();
    }
}
