package ThemePark;

import ThemePark.Interfaces.IReviewed;
import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<ISecurity> locations;

    public ThemePark(ArrayList<ISecurity> locations) {
        this.locations = locations;
    }

    public ArrayList<ISecurity> getAllLocations() {
        return locations;
    }

    public String reportReviewed(){
        String report = "";
        for ( ISecurity location : locations) {
            IReviewed reviewedLocation = (IReviewed) location;
            report += reviewedLocation.getName() + " : " + reviewedLocation.getRating() + ", ";
        }
        return report;
    }

    public ArrayList<ISecurity> getAllAllowedFor(Visitor visitor) {
        ArrayList<ISecurity> result = new ArrayList<>();
        for ( ISecurity secured : this.locations) {
            if (secured.isAllowedTo(visitor)) {
                result.add(secured);
            }
        }
        return result;
    }
}