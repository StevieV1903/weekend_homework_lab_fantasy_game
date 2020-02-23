package RoomManagement;

import PlayerManagement.Barbarian;
import PlayerManagement.Dwarf;
import PlayerManagement.Knight;

public class Library extends Room {

    public Library(String name){
        super(name);
    }

    public int getRoomOccupants(){
        return players.size();
    }

    public void addKnightToRoom(Knight knight){
        players.add(knight);
    }

    public void addBarbarianToRoom(Barbarian barbarian){
        players.add(barbarian);
    }

    public void addDwarfToRoom(Dwarf dwarf){
        players.add(dwarf);
    }

    public void removeDwarfFromRoom(Dwarf dwarf){
        players.remove(dwarf);
    }
}
