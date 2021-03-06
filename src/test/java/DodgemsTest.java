import ThemePark.Attractions.Dodgems;
import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgy Dodgems", 7);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgy Dodgems", dodgems.getName());
    }

    @Test
    public void hasFunRating(){
        assertEquals(7, dodgems.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.5, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void isHalfPriceIf12_OrUnder(){
        Visitor visitor12YearsOld = new Visitor(12, 100, 10.0);
        double actualPrice = dodgems.priceFor(visitor12YearsOld);
        double expectedPrice = 2.25;
        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void isFullPriceIfOver12(){
        Visitor visitor13YearsOld = new Visitor(13, 100, 10.0);
        double actualPrice = dodgems.priceFor(visitor13YearsOld);
        double expectedPrice = 4.5;
        assertEquals(expectedPrice, actualPrice, 0.01);
    }


}
