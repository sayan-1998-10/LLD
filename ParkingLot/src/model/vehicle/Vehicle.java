package model.vehicle;

public abstract class Vehicle {
    int id;
    public VehicleType type;

    public Vehicle(int id, VehicleType type){
        this.type = type;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return ", Vehicle-Id: " +id + ", Vehicle-Type: " + type;
    }

}
