import org.junit.Before;
import org.junit.Test;
import player_management.Cleric;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {
    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("James", 70);
    }
    @Test
    public void hasName(){
        assertEquals("James", cleric.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(70, cleric.getHealthPoints());}
    }

