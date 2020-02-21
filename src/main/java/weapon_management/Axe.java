package weapon_management;

public class Axe extends Weapon {

    public Axe(String name, int attackDamage){

        super(name, attackDamage);

    }

    public String getName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }

}
