import ThemePark.Attractions.Playground;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("FunFunFun", 5);
    }

    @Test
    public void visitorCanGetInIf15(){
        Visitor visitor15YearOld = new Visitor(15, 0, 0);
        assertTrue(playground.isAllowedTo(visitor15YearOld));
    }

    @Test
    public void visitorCannotGetInIf16(){
        Visitor visitor16YearOld = new Visitor(16, 0, 0);
        assertFalse(playground.isAllowedTo(visitor16YearOld));
    }



}
