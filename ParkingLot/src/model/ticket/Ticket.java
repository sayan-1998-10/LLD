package model.ticket;

import model.parking.ParkingSpot;
import model.vehicle.Vehicle;

public class Ticket {
    int id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    long entryTime;

    private Ticket(){}

    private Ticket(Vehicle vehicle, ParkingSpot parkingSpot){
        this.id = (int)(Math.random()*1000);
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = System.currentTimeMillis();
    }

    public static Ticket generateTicket(ParkingSpot ps,Vehicle vehicle){
        return new Ticket(vehicle,ps);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getId() {
        return id;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "Ticket-Id: " +id +  vehicle + parkingSpot;
    }
}
