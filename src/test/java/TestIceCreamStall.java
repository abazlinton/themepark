import ThemePark.Stalls.IceCreamStall;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIceCreamStall {

    private IceCreamStall IceCreamStall;

    @Before
    public void before(){
        IceCreamStall = new IceCreamStall("Ice Ice Baby", "John", 20, 6);
    }

    @Test
    public void hasPrice(){
        assertEquals(4.1, IceCreamStall.defaultPrice(), 0.01 );
    }

    @Test
    public void hasSamePriceForACustomer(){
        assertEquals(4.1, IceCreamStall.priceFor(new Visitor(10, 100, 10)), 0.01);
    }


}
