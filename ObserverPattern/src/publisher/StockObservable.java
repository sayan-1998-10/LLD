package publisher;

import subscriber.NotificationAlertObserver;

import java.util.Iterator;

public interface StockObservable {

    public void subscribe(NotificationAlertObserver observer);

    public void unsubscribe(Iterator<NotificationAlertObserver> itr);

    public void notifySubscribers();

    public void setStockCount(int count);

    public String getStockCount();
}
