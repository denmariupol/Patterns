package Behavior;

import iface.WeaponBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("BOW!!!");
    }
}
