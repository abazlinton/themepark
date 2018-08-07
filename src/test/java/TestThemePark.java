import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Playground;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.Interfaces.ISecurity;
import ThemePark.Stalls.TabaccoStall;
import ThemePark.ThemePark;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    Visitor youngVisitor;
    Visitor parentVisitor;
    Playground playground;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    ThemePark themePark;
    TabaccoStall tabaccoStall;

    @Before
    public void before() {
        youngVisitor = new Visitor(12, 133, 10.3);
        parentVisitor = new Visitor(37, 183, 40.3);
        playground = new Playground("Happy Tree Friends", 6);
        rollercoaster = new Rollercoaster("Death Stirr", 6);
        dodgems = new Dodgems("Mud Max", 6);
        tabaccoStall = new TabaccoStall("Smoke Screen", "Dodgy Bill", 3, 1);

        ArrayList<ISecurity> locations = new ArrayList<>();
        locations.add(playground);
        locations.add(rollercoaster);
        locations.add(dodgems);
        locations.add(tabaccoStall);

        themePark = new ThemePark(locations);
    }

    @Test
    public void testGetAllReviewed() {
        assertEquals(4, themePark.getAllLocations().size());
    }


    @Test
    public void testReport() {
        String expectedReport = "Happy Tree Friends : 6, Death Stirr : 6, Mud Max : 6, Smoke Screen : 1, ";
        assertEquals(expectedReport, themePark.reportReviewed());
    }


    @Test
    public void testGetAllAllowedForYoung(){
        assertEquals(2, themePark.getAllAllowedFor(youngVisitor).size());
    }

    @Test
    public void testGetAllAllowed(){
        assertEquals(3, themePark.getAllAllowedFor(parentVisitor).size());
    }

}
