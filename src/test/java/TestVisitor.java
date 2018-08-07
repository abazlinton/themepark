import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {
    Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor(16, 146, 5.60);
    }

    @Test
    public void hasAge(){
        assertEquals(16,visitor1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(146,visitor1.getHeightInCm());
    }

    @Test
    public void hasMoney(){
        assertEquals(5.60,visitor1.getMoney(),0.01);
    }




}
