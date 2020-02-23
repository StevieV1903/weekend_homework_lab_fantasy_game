package HealingToolManagement;

import BehaviourManagement.IHealing;

public class Potion extends HealingTool implements IHealing {

    public Potion(String name, int healingPower) {
        super(name, healingPower);
    }

    @Override
    public String healingToolUserInstructions(){
        return "Add to enemies drink";
    }


}
