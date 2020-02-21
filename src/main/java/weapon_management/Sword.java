package weapon_management;

public class Sword extends Weapon {
    public Sword(String name, int attackDamage){
        super(name, attackDamage);
    }

//    public String getName(){
//    return this.name;
//    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}
