package PlayerManagement;

import BehaviourManagement.IWeapon;

public class Barbarian extends Player {

    IWeapon weapon;

    public Barbarian(String name, int healthPoints, IWeapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public String weaponUserInstructions(){
        return this.weapon.weaponUserInstructions();
    }

    public IWeapon getWeapon(){
        return this.weapon;
    }


}



