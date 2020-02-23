import BehaviourManagement.IWeapon;
import WeaponManagement.Axe;
import WeaponManagement.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Barbarian;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;

    @Before
    public void before() {
       barbarian = new Barbarian("Steve", 20, axe);
       axe = new Axe("Axe", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, barbarian.getHealthPoints());
    }

//    @Test
//    public void hasWeapon(){
//        Weapon weapon = (Weapon) barbarian.getWeapon();
//        assertEquals("Axe", weapon.getName());
//    }



    @Test
    public void canUseAxe(){
        assertEquals("Lift, swing, slice", barbarian.weaponUserInstructions());
    }

}
