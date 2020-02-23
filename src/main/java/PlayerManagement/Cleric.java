package PlayerManagement;

import BehaviourManagement.IHealing;
import BehaviourManagement.IWeapon;

public class Cleric extends Player {

    IHealing healingTool;

    public Cleric(String name, int healthPoints, IHealing healingTool){
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public String healingToolUserInstructions(){
        return this.healingTool.healingToolUserInstructions();
    }

    public IHealing getHealingTool(){
        return this.healingTool;
    }

    public void changeHealingTool(IHealing newHealingTool){
        this.healingTool = newHealingTool;
    }
}


