import org.junit.Before;
import org.junit.Test;
import spell_management.Freeze;

import static org.junit.Assert.assertEquals;

public class FreezeTest {

    Freeze freeze;

    @Before
    public void before(){
        freeze = new Freeze("ice bolts", 7);
    }

    @Test
    public void hasName(){
        assertEquals("ice bolts", freeze.getName());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(7, freeze.getAttackDamage());
    }

}
