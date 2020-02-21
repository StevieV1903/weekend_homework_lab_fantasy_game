package weapon_management;

public class Club extends Weapon {

    public Club(String name, int attackDamage){
    super(name, attackDamage);}

    public String getName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }


}

