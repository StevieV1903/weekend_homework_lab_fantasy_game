package WeaponManagement;

import BehaviourManagement.IWeapon;

public class Axe extends Weapon implements IWeapon {

    public Axe(String name, int attackDamage){

        super(name, attackDamage);
    }

    @Override
    public String weaponUserInstructions(){
        return "Lift, swing, slice";
    }
}
