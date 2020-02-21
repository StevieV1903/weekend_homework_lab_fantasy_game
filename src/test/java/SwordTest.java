import org.junit.Before;
import org.junit.Test;
import weapon_management.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword("broad sword", 30);
    }

    @Test
    public void hasName(){
        assertEquals("broad sword", sword.getName());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(30, sword.getAttackDamage());
    }
}
