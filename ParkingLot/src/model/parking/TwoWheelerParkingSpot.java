package model.parking;

import model.vehicle.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot {

    public TwoWheelerParkingSpot(int distanceFromEntranceGate) {
        super((int)(Math.random()*1000), PriceParkingSpot.TWO_WHEELER_PS_PRICE, distanceFromEntranceGate);
    }
}
