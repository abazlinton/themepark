package ThemePark.Stalls;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Interfaces.ITicketed;
import ThemePark.Interfaces.IReviewed;
import ThemePark.Visitors.Visitor;

public abstract class Stall implements ITicketed, IReviewed, ISecurity {
    private String name;
    private String ownerName;
    private int parkingSpot;

    private int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating)   {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getRating(){
        return this.rating;
    }

    @Override
    public Boolean isAllowedTo(Visitor visitor) {
        return true;
    }
}
