package HealingToolManagement;

import BehaviourManagement.IHealing;

public class Herb extends HealingTool implements IHealing {

    public Herb(String name, int healingPower) {
        super(name, healingPower);
    }

    @Override
    public String healingToolUserInstructions(){
        return "Add to enemies food";
    }
}
