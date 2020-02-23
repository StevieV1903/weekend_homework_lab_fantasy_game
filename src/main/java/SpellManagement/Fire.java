package SpellManagement;

import BehaviourManagement.ISpell;

public class Fire extends Spell implements ISpell {
    public Fire(String name, int attackDamage){
        super(name, attackDamage);
    }

    @Override
    public String spellUserInstructions(){
        return "Rub hands together and throw fire balls";
    }

}
