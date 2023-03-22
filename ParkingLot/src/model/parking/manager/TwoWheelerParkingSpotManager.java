package model.parking.manager;

import model.parking.ParkingSpot;

import java.util.*;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    static TwoWheelerParkingSpotManager _instance = null;
    private TwoWheelerParkingSpotManager(PriorityQueue<ParkingSpot> parkingSpotQueue, Map<Integer, Boolean> initMap) {
        super(parkingSpotQueue,initMap);
    }

    public static TwoWheelerParkingSpotManager getManager(){
        if(_instance == null){
            PriorityQueue<ParkingSpot> initQueue = new PriorityQueue<ParkingSpot>((x,y) -> x.getDistanceFromEntranceGate() - y.getDistanceFromEntranceGate());
            Map<Integer, Boolean> initMap = new HashMap<Integer, Boolean>();
            _instance = new TwoWheelerParkingSpotManager(initQueue,initMap);
        }
        return _instance;
    }

}
