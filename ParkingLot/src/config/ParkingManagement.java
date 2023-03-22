package config;

import model.parking.FourWheelerParkingSpot;
import model.parking.ParkingSpot;
import model.parking.TwoWheelerParkingSpot;
import model.parking.manager.FourWheelerParkingSpotManager;
import model.parking.manager.ParkingSpotManager;
import model.parking.manager.TwoWheelerParkingSpotManager;
import model.payment.CostComputation;
import model.payment.strategy.PaymentStrategy;

public class ParkingManagement {

    public static void createParkingSpace(){
        ParkingSpotManager twoWheelerManager = TwoWheelerParkingSpotManager.getManager();
        ParkingSpotManager fourWheelerManager = FourWheelerParkingSpotManager.getManager();

        //create 2 wheeler PS..
        ParkingSpot TWO_spot1 = new TwoWheelerParkingSpot(10);
        ParkingSpot TWO_spot2 = new TwoWheelerParkingSpot(20);
        ParkingSpot TWO_spot3 = new TwoWheelerParkingSpot(30);
        ParkingSpot TWO_spot4 = new TwoWheelerParkingSpot(5);
        ParkingSpot TWO_spot5 = new TwoWheelerParkingSpot(1);
        ParkingSpot TWO_spot6 = new TwoWheelerParkingSpot(50);

        twoWheelerManager.addParkingSpot(TWO_spot1);
        twoWheelerManager.addParkingSpot(TWO_spot2);
        twoWheelerManager.addParkingSpot(TWO_spot3);
        twoWheelerManager.addParkingSpot(TWO_spot4);
        twoWheelerManager.addParkingSpot(TWO_spot5);
        twoWheelerManager.addParkingSpot(TWO_spot6);

        //create 4 wheeler PS..

        ParkingSpot FOUR_spot1 = new FourWheelerParkingSpot(8);
        ParkingSpot FOUR_spot2 = new FourWheelerParkingSpot(25);
        ParkingSpot FOUR_spot3 = new FourWheelerParkingSpot(10);
        ParkingSpot FOUR_spot4 = new FourWheelerParkingSpot(37);
        ParkingSpot FOUR_spot5 = new FourWheelerParkingSpot(16);
        ParkingSpot FOUR_spot6 = new FourWheelerParkingSpot(18);

        fourWheelerManager.addParkingSpot(FOUR_spot1);
        fourWheelerManager.addParkingSpot(FOUR_spot2);
        fourWheelerManager.addParkingSpot(FOUR_spot3);
        fourWheelerManager.addParkingSpot(FOUR_spot4);
        fourWheelerManager.addParkingSpot(FOUR_spot5);
        fourWheelerManager.addParkingSpot(FOUR_spot6);
    }

    public static void setCostComputingStrategy(PaymentStrategy strategy){
        CostComputation.setStrategy(strategy);
    }

    public static void  listAllAvailableParkingSpaces(){
        ParkingSpotManager twoWheelerManager = TwoWheelerParkingSpotManager.getManager();
        ParkingSpotManager fourWheelerManager = FourWheelerParkingSpotManager.getManager();

        System.out.println("AVAILABLE TWO WHEELER PARKING SPOTS -->" + twoWheelerManager.getAvailableParkingSpots());
        System.out.println("AVAILABLE FOUR  WHEELER PARKING SPOTS -->" + fourWheelerManager.getAvailableParkingSpots());
    }

}
