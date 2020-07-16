package vehicleExtensions2;

public class Main1 {
    public static void main(String[] args) {
        Bus bus = new Bus(35, 5, 1000);
        System.out.println(bus.drive(1));
        System.out.println(bus.driveWithPassengers(5));
        System.out.println(bus.drive(1));
    }
}
