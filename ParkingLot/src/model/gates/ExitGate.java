package model.gates;

import model.parking.ParkingSpot;
import model.parking.manager.ParkingSpotManager;
import model.parking.manager.ParkingSpotManagerFactory;
import model.payment.CostComputation;
import model.ticket.Ticket;
import model.vehicle.Vehicle;

public class ExitGate {

    public long exitParking(Ticket ticket){
        long price = findTotalCost(ticket);
        releaseParkingSpace(ticket.getParkingSpot());
        return price;

    }
    public long findTotalCost(Ticket ticket){
        return CostComputation.findTotalPrice(ticket);
    }
    public void releaseParkingSpace(ParkingSpot ps){
        ParkingSpotManager manager = ParkingSpotManagerFactory.getManager(ps.getVehicle());
        manager.removeVehicleFromPS(ps);
    }
}
