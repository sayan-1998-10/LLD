package model.parking;

public enum PriceParkingSpot {
    TWO_WHEELER_PS_PRICE(10),
    FOUR_WHEELER_PS_PRICE(40);

    long price;

    PriceParkingSpot(long price){
        this.price = price;
    }
    public long getPrice(){
        return this.price;
    }
}
