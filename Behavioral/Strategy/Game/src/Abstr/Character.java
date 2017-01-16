package Abstr;

import iface.WeaponBehavior;

/**
 * Created by den on 2017-01-03.
 */
public abstract class Character {
    public WeaponBehavior weaponBehavior;

    public abstract void Fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    public void UseWeapon(){
        weaponBehavior.UseWeapon();
    }
}
