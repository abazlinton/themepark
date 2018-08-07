import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestRollerCoaster {

    private Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Logger's Leap", 9);
    }

    @Test
    public void visitorUnderHeightCannotGetIn(){
        Visitor shortVisitor = new Visitor(8, 144, 10);
        assertFalse(rollercoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void visitorAtLeastHeightCanGetIn(){
        Visitor tallEnoughVisitor = new Visitor(15, 145, 10);
        assertTrue(rollercoaster.isAllowedTo(tallEnoughVisitor));
    }

    @Test
    public void visitorAtLeast12CanGetIn(){
        Visitor visitor12YearsOld = new Visitor(12, 1000, 10);
        assertTrue(rollercoaster.isAllowedTo(visitor12YearsOld));
    }

    @Test
    public void visitorYoungerThan12CannotGetIn(){
        Visitor visitor5YearsOld = new Visitor(11, 1000, 10);
        assertFalse(rollercoaster.isAllowedTo(visitor5YearsOld));
    }


    @Test
    public void visitorMoreThan200cmChargedDouble(){
        Visitor visitorTall = new Visitor(12, 201, 15);
        assertEquals(16.80, rollercoaster.priceFor(visitorTall), 0.01);

    }

    @Test
    public void visitor200cmOrLessChargedNormally(){
        Visitor visitorShort = new Visitor(12, 200, 15);
        assertEquals(8.4, rollercoaster.priceFor(visitorShort), 0.01);

    }
}
