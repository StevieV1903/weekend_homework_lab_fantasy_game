package PlayerManagement;

import BehaviourManagement.IHealing;
import BehaviourManagement.IWeapon;

public class Cleric extends Player {

    IHealing healingToolChoice;

    public Cleric(String name, int healthPoints, IHealing healingTool){
        super(name, healthPoints);
        this.healingToolChoice = healingTool;
    }

    public String healingToolUserInstructions(){
        return this.healingToolChoice.healingToolUserInstructions();
    }

    public IHealing getHealingTool(){
        return this.healingToolChoice;
    }

    public void changeHealingTool(IHealing newHealingTool){
        this.healingToolChoice = newHealingTool;
    }
}


