import Abstr.Character;
import Behavior.AxeBehavior;
import Behavior.BowAndArrowBehavior;
import Entity.King;

/**
 * Created by den on 2017-01-03.
 */
public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new AxeBehavior());
        king.UseWeapon();
        king.Fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.UseWeapon();
        king.Fight();
    }
}
