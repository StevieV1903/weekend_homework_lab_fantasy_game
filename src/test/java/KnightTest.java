import org.junit.Before;
import org.junit.Test;
import player_management.Knight;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Alex", 40);
    }
    @Test
    public void hasName(){
        assertEquals("Alex", knight.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(40, knight.getHealthPoints());
    }
}
