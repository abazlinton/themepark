import ThemePark.Stalls.TabaccoStall;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TabaccoStallTest {

    private TabaccoStall tabaccoStall;

    @Before
    public void before(){
        tabaccoStall = new TabaccoStall("Cancer sticks R Us", "Beelzebub", 5, 0);
    }

    @Test
    public void visitorUnder18CannotBuy(){
        Visitor visitor = new Visitor(17, 100, 10);
        assertFalse(tabaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitor18OrOVerCanBuy(){
        Visitor visitor = new Visitor(18, 100, 10);
        assertTrue(tabaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasPrice(){
        assertEquals(6.2, tabaccoStall.defaultPrice(), 0.01 );
    }

    @Test
    public void hasSamePriceForACustomer(){
        assertEquals(6.2, tabaccoStall.priceFor(new Visitor(10, 100, 10)), 0.01);
    }

}
