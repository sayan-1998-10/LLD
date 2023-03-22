package model.vehicle;

public class FourWheelerVehicle extends Vehicle{
    public FourWheelerVehicle() {
        super((int)(Math.random()*1000), VehicleType.FOUR_WHEELER);
    }
}
