import org.junit.Before;
import org.junit.Test;
import PlayerManagement.Wizard;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Andrew", 60);
    }

    @Test
    public void hasName() {
        assertEquals("Andrew", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(60, wizard.getHealthPoints());
    }

}