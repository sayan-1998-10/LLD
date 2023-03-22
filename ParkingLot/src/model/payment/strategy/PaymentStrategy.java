package model.payment.strategy;

import model.ticket.Ticket;

public interface PaymentStrategy {
    public long getTotalPrice(Ticket ticket);

}
