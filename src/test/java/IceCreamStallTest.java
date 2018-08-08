import ThemePark.Stalls.IceCreamStall;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Ice Baby", "John", 20, 6);
    }

    @Test
    public void hasPrice(){
        assertEquals(4.1, iceCreamStall.defaultPrice(), 0.01 );
    }

    @Test
    public void hasSamePriceForACustomer(){
        assertEquals(4.1, iceCreamStall.priceFor(new Visitor(10, 100, 10)), 0.01);
    }

    @Test
    public void isUnrestrictedByDefault(){
        Visitor visitor = new Visitor(15, 100, 100);
        assertTrue(iceCreamStall.isAllowedTo(visitor));
    }


}
