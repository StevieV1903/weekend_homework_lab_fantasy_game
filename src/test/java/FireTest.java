import org.junit.Before;
import org.junit.Test;
import spell_management.Fire;

import static org.junit.Assert.assertEquals;

public class FireTest {

    Fire fire;

    @Before
    public void before(){
        fire = new Fire("fire ball", 20);
    }

    @Test
    public void hasName(){
        assertEquals("fire ball", fire.getName());
    }

    @Test

    public void hasAttackDamage(){
        assertEquals(20, fire.getAttackDamage());
    }
}
