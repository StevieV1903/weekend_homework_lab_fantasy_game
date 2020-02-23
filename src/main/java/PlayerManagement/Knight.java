package PlayerManagement;

public class Knight extends Player {

    int bodyArmour;

    public Knight(String name, int healthPoints, int bodyArmour) {
        super(name, healthPoints);
        this.bodyArmour = bodyArmour;
    }

    public int getBodyArmourProtection(){
        return this.bodyArmour;
    }


}

