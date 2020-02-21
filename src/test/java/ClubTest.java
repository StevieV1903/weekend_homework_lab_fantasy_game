import org.junit.Before;
import org.junit.Test;
import weapon_management.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club("wooden club", 5);
    }

    @Test
    public void hasName(){
        assertEquals("wooden club", club.getName());
    }

    @Test
    public void hasAttackDamage(){
        assertEquals(5, club.getAttackDamage());
    }
}
