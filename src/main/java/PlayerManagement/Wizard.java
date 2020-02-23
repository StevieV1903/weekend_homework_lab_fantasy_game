package PlayerManagement;

import BehaviourManagement.IHealing;
import BehaviourManagement.ISpell;

public class Wizard extends Player {

    ISpell spellChoice;


    public Wizard(String name, int healthPoints, ISpell spell){
        super(name, healthPoints);
        this.spellChoice = spell;
    }

    public String spellUserInstructions(){
        return this.spellChoice.spellUserInstructions();
    }

    public ISpell getSpell(){
        return this.spellChoice;
    }

    public void changeSpell(ISpell newSpell){
        this.spellChoice = newSpell;
    }

}
