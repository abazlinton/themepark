package ThemePark.Stalls;

import ThemePark.Visitors.Visitor;

public class CandyFlossStall extends Stall {

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double priceFor(Visitor visitor){
        return defaultPrice();
    }

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int funRating)   {
        super(name, ownerName, parkingSpot, funRating);
    }
}
