import config.ParkingManagement;
import model.gates.EntranceGate;
import model.gates.ExitGate;
import model.payment.strategy.HourlyBasisPaymentStrategy;
import model.payment.strategy.MinuteBasisPaymentStrategy;
import model.ticket.Ticket;
import model.vehicle.FourWheelerVehicle;
import model.vehicle.TwoWheelerVehicle;
import model.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        //Initializing the parking area
        ParkingManagement.createParkingSpace();
        ParkingManagement.setCostComputingStrategy(new MinuteBasisPaymentStrategy());

        ParkingManagement.listAllAvailableParkingSpaces();

        //Create 2 wheeler and 4 wheeler vehicles..
        Vehicle TV_1 = new TwoWheelerVehicle();
        Vehicle TV_2 = new TwoWheelerVehicle();

        Vehicle FV_1 = new FourWheelerVehicle();
        Vehicle FV_2 = new FourWheelerVehicle();

        //Create 1 Entrance and 1 Exit Gate..
        EntranceGate entranceGate = new EntranceGate();
        ExitGate exitGate = new ExitGate();

        Ticket TV_1_TICKET = entranceGate.findParkingSpace(TV_1);
        Ticket TV_2_TICKET = entranceGate.findParkingSpace(TV_2);
        Ticket TV_3_TICKET = entranceGate.findParkingSpace(TV_2);

        Ticket FV_1_TICKET = entranceGate.findParkingSpace(FV_1);
        Ticket FV_2_TICKET = entranceGate.findParkingSpace(FV_2);

        System.out.println("FOR TWO WHEELERS::");
        System.out.println(TV_1_TICKET);
        System.out.println(TV_2_TICKET);
        System.out.println(TV_3_TICKET);

        System.out.println("FOR FOUR WHEELERS::");
        System.out.println(FV_1_TICKET);
        System.out.println(FV_2_TICKET);

        try{
            Thread.sleep(10 * 60000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        long TV_1_PRICE = exitGate.exitParking(TV_1_TICKET);
        long TV_2_PRICE = exitGate.exitParking(TV_2_TICKET);
        long TV_3_PRICE = exitGate.exitParking(TV_3_TICKET);

        long FV_1_PRICE = exitGate.exitParking(FV_1_TICKET);
        long FV_2_PRICE = exitGate.exitParking(FV_2_TICKET);

        System.out.println("FOR TWO WHEELERS::");
        System.out.println("TV_1_PRICE :: " + TV_1_PRICE);
        System.out.println("TV_2_PRICE :: " + TV_2_PRICE);

        System.out.println("FOR FOUR WHEELERS::");
        System.out.println("FV_1_PRICE :: " + FV_1_PRICE);
        System.out.println("FV_2_PRICE :: " + FV_2_PRICE);

        ParkingManagement.listAllAvailableParkingSpaces();
    }


}