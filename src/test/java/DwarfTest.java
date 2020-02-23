import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Dwarf;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Luca", 30);
    }
    @Test
    public void hasName(){
        assertEquals("Luca", dwarf.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(30, dwarf.getHealthPoints());
    }
}
