package publisher;

import subscriber.NotificationAlertObserver;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MacbookObservableImpl implements  StockObservable{

    private List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    private int macBookStock = 0;

    @Override
    public void subscribe(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Iterator<NotificationAlertObserver> itr) {
        itr.remove();
    }

    @Override
    public void notifySubscribers() {
        Iterator<NotificationAlertObserver> itr = observerList.iterator();
        while(itr.hasNext()){
            NotificationAlertObserver observer = itr.next();
            observer.update(this);
            unsubscribe(itr);
        }
    }

    @Override
    public void setStockCount(int count) {
        if(this.macBookStock == 0 && count > 0){
            this.macBookStock += count;
            this.notifySubscribers();
        }
    }

    @Override
    public String getStockCount() {
        return "MacBook Stock has been updated. Current Stock Quantity --->"+this.macBookStock;
    }
}
