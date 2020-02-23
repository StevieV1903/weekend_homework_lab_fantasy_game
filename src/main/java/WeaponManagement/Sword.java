package WeaponManagement;

import BehaviourManagement.IWeapon;

public class Sword extends Weapon implements IWeapon {
    public Sword(String name, int attackDamage){
        super(name, attackDamage);
    }

    @Override
    public String weaponUserInstructions(){
        return "Lift, swing, stab and death!!";
    }

}
