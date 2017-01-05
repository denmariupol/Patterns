package Behavior;

import iface.WeaponBehavior;

/**
 * Created by den on 2017-01-03.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("AXE!!!");
    }
}
