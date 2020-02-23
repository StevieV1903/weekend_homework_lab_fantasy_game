import PlayerManagement.Barbarian;
import SpellManagement.Fire;
import SpellManagement.Freeze;
import SpellManagement.Spell;
import WeaponManagement.Club;
import WeaponManagement.Sword;
import WeaponManagement.Weapon;
import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Wizard;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fire fire;

    @Before
    public void before() {
        fire = new Fire("fireballs", 45);
        wizard = new Wizard("Andrew", 60, fire);
    }

    @Test
    public void hasName() {
        assertEquals("Andrew", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(60, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        Spell spell = (Spell) wizard.getSpell();
        assertEquals("fireballs", spell.getName());
    }

    @Test
    public void canUseSpell(){
        assertEquals("Rub hands together and throw fire balls", wizard.spellUserInstructions());
    }

    @Test
    public void canUseFreezeSpell(){
        Freeze freeze = new Freeze("frozone", 22);
        wizard = new Wizard("Oscario", 20, freeze);
        assertEquals("Rub hands together and project ice bolts", wizard.spellUserInstructions());
    }

    @Test
    public void wizardCanChangeSpell(){
        Freeze freeze = new Freeze("frozone", 30);
        wizard.changeSpell(freeze);
        assertEquals("Rub hands together and project ice bolts", wizard.spellUserInstructions());

    }


}