package model.parking;

import model.vehicle.Vehicle;

public abstract class ParkingSpot {
    int id;
    PriceParkingSpot price;
    Vehicle vehicle;

    int distanceFromEntranceGate;

    public ParkingSpot(int id,PriceParkingSpot price, int distanceFromEntranceGate){
        this.id = id;
        this.price = price;
        this.distanceFromEntranceGate = distanceFromEntranceGate;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long getPrice(){
        return this.price.getPrice();
    };

    public boolean isEmpty(){
        return this.vehicle == null;
    };
    public void parkVehicle(Vehicle v){
        this.vehicle = v;
    };
    public void removeVehicle(){
        this.vehicle = null;
    };

    public int getDistanceFromEntranceGate() {
        return distanceFromEntranceGate;
    }

    public void setPrice(PriceParkingSpot price) {
        this.price = price;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setDistanceFromEntranceGate(int distanceFromEntranceGate) {
        this.distanceFromEntranceGate = distanceFromEntranceGate;
    }

    @Override
    public String toString() {
        return ", Parking-Spot-Id: " +id + ", Parking-Spot-Price: " + price.getPrice() + ", Parking-Spot-distance: "+ distanceFromEntranceGate;
    }
}
