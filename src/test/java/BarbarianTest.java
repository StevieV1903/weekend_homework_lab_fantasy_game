import BehaviourManagement.IWeapon;
import PlayerManagement.Wizard;
import WeaponManagement.Axe;
import WeaponManagement.Club;
import WeaponManagement.Sword;
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
        axe = new Axe("Axe", 20);
        barbarian = new Barbarian("Steve", 20, axe);

    }

    @Test
    public void hasName() {
        assertEquals("Steve", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        Weapon weapon = (Weapon) barbarian.getWeapon();
        assertEquals("Axe", weapon.getName());
    }

    @Test
    public void canUseAxe(){
        assertEquals("Lift, swing, slice", barbarian.weaponUserInstructions());
    }

    @Test
    public void canUseClub(){
        Club club = new Club("club", 17);
        barbarian = new Barbarian("Considine", 20, club);
        assertEquals("Lift, swing, damage, repeat", barbarian.weaponUserInstructions());
    }

    @Test
    public void canUseSword(){
        Sword sword = new Sword("sword", 55);
        barbarian = new Barbarian("Considine", 20, sword);
        assertEquals("Lift, swing, stab and death!!", barbarian.weaponUserInstructions());
    }

    @Test
    public void barbarianCanChangeWeapon(){
        Sword sword = new Sword("Sword", 75);
        barbarian.changeWeapon(sword);
        assertEquals("Lift, swing, stab and death!!", barbarian.weaponUserInstructions());

    }


}