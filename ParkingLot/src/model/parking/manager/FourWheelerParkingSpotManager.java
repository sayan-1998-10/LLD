package model.parking.manager;

import model.parking.ParkingSpot;

import java.util.*;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    static FourWheelerParkingSpotManager _instance = null;
    private FourWheelerParkingSpotManager(PriorityQueue<ParkingSpot> parkingSpotQueue, Map<Integer, Boolean> initMap) {
        super(parkingSpotQueue,initMap);
    }

    public static FourWheelerParkingSpotManager getManager(){
        if(_instance == null){
            PriorityQueue<ParkingSpot> initQueue = new PriorityQueue<ParkingSpot>((x,y) -> x.getDistanceFromEntranceGate() - y.getDistanceFromEntranceGate());
            Map<Integer, Boolean> initMap = new HashMap<Integer, Boolean>();
            _instance = new FourWheelerParkingSpotManager(initQueue,initMap);
        }
        return _instance;
    }
}
