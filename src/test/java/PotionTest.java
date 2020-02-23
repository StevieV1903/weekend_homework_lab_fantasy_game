import HealingToolManagement.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {
    Potion potion;

    @Before
    public void before(){
        potion = new Potion("buckfast", 40);
    }
    @Test
    public void hasName(){
        assertEquals("buckfast", potion.getName());
    }
    @Test
    public void hasHealingPower(){
        assertEquals(40, potion.getHealingPower());
    }
}
