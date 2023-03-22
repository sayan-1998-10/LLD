package model.parking.manager;

import model.parking.ParkingSpot;
import model.vehicle.Vehicle;
import model.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingSpotManagerFactory {

    public static ParkingSpotManager getManager(Vehicle vehicle){

        switch(vehicle.type){
            case TWO_WHEELER : {
                return TwoWheelerParkingSpotManager.getManager();
            }
            case FOUR_WHEELER:{
                return FourWheelerParkingSpotManager.getManager();
            }

        }

        return null;
    }
}
