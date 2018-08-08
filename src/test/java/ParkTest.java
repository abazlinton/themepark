import ThemePark.Attractions.Park;
import ThemePark.Visitors.Visitor;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkTest {

    @Test
    public void parkIsUnrestrictedByDefault(){
        Park park = new Park("Park", 1);
        Visitor visitor = new Visitor(0, 0, 0);
        assertTrue(park.isAllowedTo(visitor));
    }

}
