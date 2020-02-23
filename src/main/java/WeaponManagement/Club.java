package WeaponManagement;

import BehaviourManagement.IWeapon;

public class Club extends Weapon implements IWeapon {

    public Club(String name, int attackDamage){
    super(name, attackDamage);}

    @Override
    public String weaponUserInstructions(){
        return "Lift, swing, damage, repeat";
    }

}

