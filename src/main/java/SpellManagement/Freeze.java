package SpellManagement;

import BehaviourManagement.ISpell;

public class Freeze extends Spell implements ISpell {
    public Freeze(String name, int attackDamage){
        super(name, attackDamage);
    }

    @Override
    public String spellUserInstructions(){
        return "Rub hands together and project ice bolts";
    }

}
