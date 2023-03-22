package model.payment;

import model.parking.ParkingSpot;
import model.payment.strategy.PaymentStrategy;
import model.ticket.Ticket;

public class CostComputation {
    static PaymentStrategy strategy;

    public static PaymentStrategy getStrategy() {
        return strategy;
    }

    public static void setStrategy(PaymentStrategy strategy) {
        CostComputation.strategy = strategy;
    }

    public static long findTotalPrice(Ticket ticket){
        return strategy.getTotalPrice(ticket);
    }


}
