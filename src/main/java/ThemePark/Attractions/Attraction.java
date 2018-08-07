package ThemePark.Attractions;

import ThemePark.Interfaces.IReviewed;
import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitors.Visitor;

public abstract class Attraction implements IReviewed, ISecurity {
    String name;
    int rating;


    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating(){
        return this.rating;
    }

    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return true;
    }
}
