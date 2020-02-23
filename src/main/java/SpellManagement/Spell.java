package SpellManagement;

public abstract class Spell {

    String name;
    int attackDamage;

    public Spell(String name, int attackDamage) {
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