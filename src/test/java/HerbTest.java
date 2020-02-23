import HealingToolManagement.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    Herb herb;

    @Before
    public void before(){
        herb = new Herb("Lavender", 15);
    }

    @Test
    public void hasName(){
        assertEquals("Lavender", herb.getName());
    }

    @Test
    public void hasHealingPower(){
        assertEquals(15, herb.getHealingPower());
    }
}
