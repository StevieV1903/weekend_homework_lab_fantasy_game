import HealingToolManagement.HealingTool;
import HealingToolManagement.Herb;
import HealingToolManagement.Potion;
import PlayerManagement.Barbarian;
import WeaponManagement.Club;
import WeaponManagement.Sword;
import WeaponManagement.Weapon;
import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Cleric;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Herb herb;

    @Before
    public void before(){
        herb = new Herb("Turmeric", 20);
        cleric = new Cleric("James", 70, herb);
    }
    @Test
    public void hasName(){
        assertEquals("James", cleric.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(70, cleric.getHealthPoints());
    }
    @Test
    public void hasHerb(){
        HealingTool healingTool = (HealingTool) cleric.getHealingTool();
        assertEquals("Turmeric", healingTool.getName());
    }

    @Test
    public void canUseHerb(){
        assertEquals("Add to enemies food", cleric.healingToolUserInstructions());
    }

    @Test
    public void canUsePotion(){
        Potion potion = new Potion("vodka", 27);
        cleric = new Cleric("James", 20, potion);
        assertEquals("Add to enemies drink", cleric.healingToolUserInstructions());
    }

    @Test
    public void clericCanChangeHealingTool(){
        Potion potion = new Potion("buckfast", 75);
        cleric.changeHealingTool(potion);
        assertEquals("Add to enemies drink", cleric.healingToolUserInstructions());

    }






}



