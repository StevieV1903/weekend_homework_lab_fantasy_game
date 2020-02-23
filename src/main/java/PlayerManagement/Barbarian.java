package PlayerManagement;

import BehaviourManagement.IWeapon;

public class Barbarian extends Player {

    IWeapon weaponChoice;

    public Barbarian(String name, int healthPoints, IWeapon weapon){
        super(name, healthPoints);
        this.weaponChoice = weapon;
    }

    public String weaponUserInstructions(){
        return this.weaponChoice.weaponUserInstructions();
    }

    public IWeapon getWeapon(){
        return this.weaponChoice;
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weaponChoice = newWeapon;
    }


}



