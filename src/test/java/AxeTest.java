import org.junit.Before;
import org.junit.Test;
import WeaponManagement.Axe;

import static org.junit.Assert.assertEquals;


public class AxeTest {

    Axe axe;
    @Before
    public void before(){
        axe = new Axe("battleaxe", 10);
    }
    @Test
    public void hasName(){
        assertEquals("battleaxe", axe.getName());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(10, axe.getAttackDamage());
    }

}
