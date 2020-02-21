package room_management;

import player_management.Player;

import java.util.ArrayList;

public abstract class Room {

        private String name;
        protected ArrayList<Player> players;


        public Room(String name){
            this.name = name;
            this.players = new ArrayList<Player>();

        }
        public String getName(){
            return this.name;
        }
    }


