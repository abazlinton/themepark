import ThemePark.Stalls.CandyFlossStall;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCandyFlossStall {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Cool Candy", "Alex", 10, 5);
    }

    @Test
    public void hasPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01 );
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Alex", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasName(){
        assertEquals("Cool Candy", candyFlossStall.getName());

    }

    @Test
    public void hasParkingSpots(){
        assertEquals(10, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasRating() {
        assertEquals(5, candyFlossStall.getRating());
    }


    @Test
    public void hasSamePriceForACustomer(){
        assertEquals(4.2, candyFlossStall.priceFor(new Visitor(10, 100, 10)), 0.01);
    }


}
