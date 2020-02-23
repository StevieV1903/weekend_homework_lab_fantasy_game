import BehaviourManagement.IWeapon;
import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Barbarian;
import PlayerManagement.Dwarf;
import PlayerManagement.Knight;
import RoomManagement.Library;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Knight knight;
    Barbarian barbarian;
    Dwarf dwarf;
    IWeapon axe;


    @Before
    public void before(){
    library = new Library("Library");
    knight = new Knight("Galahad", 50);
    barbarian = new Barbarian("Considine", 75, axe);
    dwarf = new Dwarf("Dopey", 25);
    }

    @Test
    public void getName(){
        assertEquals("Library", library.getName());
    }

    @Test
    public void theRoomStartsEmpty(){
        assertEquals(0,library.getRoomOccupants());
    }

    @Test
    public void canAddKnightToRoom(){
        library.addKnightToRoom(knight);
        assertEquals(1, library.getRoomOccupants());
    }

    @Test
    public void canAddBarbarianToRoom(){
        library.addBarbarianToRoom(barbarian);
        assertEquals(1, library.getRoomOccupants());
    }

    @Test
    public void canAddDwarfToRoom(){
        library.addDwarfToRoom(dwarf);
        assertEquals(1, library.getRoomOccupants());
    }

    @Test
    public void canAddMultiplePlayersToRoom(){
        library.addKnightToRoom(knight);
        library.addBarbarianToRoom(barbarian);
        library.addDwarfToRoom(dwarf);
        assertEquals(3, library.getRoomOccupants());
    }

    @Test
    public void canRemovePlayerFromRoom(){
        library.addDwarfToRoom(dwarf);
        library.removeDwarfFromRoom(dwarf);
        assertEquals(0, library.getRoomOccupants());
    }
}
