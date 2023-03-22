package subscriber;

import publisher.StockObservable;

public class UserObserver implements NotificationAlertObserver{


//    public UserObserver(StockObservable publisher){
//        this.publisher = publisher;
//    }


    @Override
    public void update(StockObservable observable) {
        System.out.println(observable.getStockCount());
    }
}
