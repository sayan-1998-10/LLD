package model.vehicle;

public class TwoWheelerVehicle extends Vehicle{
    public TwoWheelerVehicle() {
        super((int)(Math.random()*1000), VehicleType.TWO_WHEELER);
    }
}
