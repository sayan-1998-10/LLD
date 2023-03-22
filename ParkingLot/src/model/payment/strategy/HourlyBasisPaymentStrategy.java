package model.payment.strategy;

import model.ticket.Ticket;

public class HourlyBasisPaymentStrategy implements PaymentStrategy{
    @Override
    public long getTotalPrice(Ticket ticket) {
        long hoursSpent = (System.currentTimeMillis() - ticket.getEntryTime()) / 3600000;
        System.out.println("Time Spent in Hours by "+ ticket.getVehicle().getId() +"at Parking Spot --"+ ticket.getParkingSpot().getId() + " --->"+ hoursSpent);
        return hoursSpent * ticket.getParkingSpot().getPrice();
    }
}
