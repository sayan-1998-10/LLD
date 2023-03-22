import publisher.IphoneObservableImpl;
import publisher.MacbookObservableImpl;
import publisher.StockObservable;
import subscriber.NotificationAlertObserver;
import subscriber.UserObserver;

public class Main {
    public static void main(String[] args) {
        //publishers
        StockObservable publisher1 = new IphoneObservableImpl();
        StockObservable publisher2 = new MacbookObservableImpl();

        //subscribers
        NotificationAlertObserver observer1 = new UserObserver();

        //subscribing
        publisher1.subscribe(observer1);
        publisher2.subscribe(observer1);

        //Updating the stock
        publisher1.setStockCount(10);
        publisher2.setStockCount(20);

    }
}