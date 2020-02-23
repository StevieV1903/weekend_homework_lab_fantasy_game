package WeaponManagement;

public abstract class  Weapon {

    String name;
    int attackDamage;

    public Weapon(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

    public String getName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}