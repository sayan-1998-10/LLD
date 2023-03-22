package model.gates;

import model.parking.ParkingSpot;
import model.parking.manager.ParkingSpotManager;
import model.parking.manager.ParkingSpotManagerFactory;
import model.ticket.Ticket;
import model.vehicle.Vehicle;

public class EntranceGate {
    ParkingSpotManager manager;

    public Ticket findParkingSpace(Vehicle vehicle){
        manager = ParkingSpotManagerFactory.getManager(vehicle);
        ParkingSpot ps = manager.findParkingSpot(vehicle);
        manager.parkVehicleInPS(ps,vehicle);
        return generateTicket(ps,vehicle);
    }

    public Ticket generateTicket(ParkingSpot ps, Vehicle vehicle){
        return Ticket.generateTicket(ps,vehicle);
    }

}
