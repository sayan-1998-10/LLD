package model.parking;

import model.vehicle.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot {
    public FourWheelerParkingSpot(int distanceFromEntranceGate) {
        super((int)(Math.random()*1000), PriceParkingSpot.FOUR_WHEELER_PS_PRICE, distanceFromEntranceGate);
    }

}
