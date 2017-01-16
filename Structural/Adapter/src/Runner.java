/**
 * Created by den on 2017-01-15.
 */
public class Runner {
    public static void main(String[] args) {
        Amunition amunition = new Adapter();

        amunition.addAmmo();
        amunition.addGrenade();
        amunition.addRifle();
        amunition.addArmour();
    }
}
