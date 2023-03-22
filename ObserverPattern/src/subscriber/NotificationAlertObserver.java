package subscriber;

import publisher.StockObservable;

public interface NotificationAlertObserver {

    public void update(StockObservable observable);
}
