package model.payment.strategy;

import model.ticket.Ticket;

public class MinuteBasisPaymentStrategy implements PaymentStrategy{
    @Override
    public long getTotalPrice(Ticket ticket) {
        long minutesSpent = (System.currentTimeMillis() - ticket.getEntryTime()) / 60000;
        System.out.println("Time Spent in Minutes by "+ ticket.getVehicle().getId() +"at Parking Spot --"+ ticket.getParkingSpot().getId() + " --->" + minutesSpent);
        return minutesSpent * ticket.getParkingSpot().getPrice();
    }
}
