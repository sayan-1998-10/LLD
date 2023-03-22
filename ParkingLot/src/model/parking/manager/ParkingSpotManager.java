package model.parking.manager;

import model.parking.ParkingSpot;
import model.vehicle.Vehicle;

import java.util.*;

public abstract class ParkingSpotManager {
    PriorityQueue<ParkingSpot> parkingSpotQueue;
    Map<Integer, Boolean> availableParkingSpots;

    public ParkingSpotManager(PriorityQueue<ParkingSpot> parkingSpotQueue,Map<Integer, Boolean> availableParkingSpots){
        this.parkingSpotQueue = parkingSpotQueue;
        this.availableParkingSpots = availableParkingSpots;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle){
        //consider only 1 entrance and use a min Heap to get the nearest distance
         ParkingSpot spot = parkingSpotQueue.poll();
         List<ParkingSpot> tempList = new ArrayList<>();

         while(!spot.isEmpty()){
             tempList.add(spot);
             spot = parkingSpotQueue.poll();
         }

         for(ParkingSpot ps : tempList){
             parkingSpotQueue.add(ps);
         }

         return spot;
    }
    public void parkVehicleInPS(ParkingSpot ps, Vehicle v){
        availableParkingSpots.put(ps.getId(),false);
        ps.parkVehicle(v);
    }
    public void removeVehicleFromPS(ParkingSpot ps){
        availableParkingSpots.put(ps.getId(),true);
        ps.removeVehicle();
    }

    public void addParkingSpot(ParkingSpot ps){
        availableParkingSpots.put(ps.getId(),true);
        this.parkingSpotQueue.add(ps);
    }

    public void removeParkingSpot(ParkingSpot ps){
        availableParkingSpots.remove(ps.getId());
        this.parkingSpotQueue.remove(ps);
    }

    public List<Integer> getAvailableParkingSpots(){
        List<Integer> availablePS = new ArrayList<Integer>();
        for(Map.Entry<Integer,Boolean> entry: this.availableParkingSpots.entrySet()){
            if(entry.getValue()){
                availablePS.add(entry.getKey());
            }
        }

        return availablePS;
    }

}
