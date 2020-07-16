package vehicle_old;

import java.util.Scanner;

public class Main_old {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] carLine = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(carLine[1]);
        double consumptionOfLitersPerKm = Double.parseDouble(carLine[2]);
        Vehicle_old car = new Car_old(fuelQuantity, consumptionOfLitersPerKm);

        String[] truckLine = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckLine[1]);
        double carConsumptionOfLitersPerKm = Double.parseDouble(truckLine[2]);
        Vehicle_old truck = new Truck_old(truckFuelQuantity, carConsumptionOfLitersPerKm);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens[0].equals("Drive")) {
                if (tokens[1].equals("Car")) {
                    double distance = Double.parseDouble(tokens[2]);
                    car.canItDriveThisMuch(distance);
                } else if (tokens[1].equals("Truck")) {
                    double distance = Double.parseDouble(tokens[2]);
                    truck.canItDriveThisMuch(distance);
                }
            } else if (tokens[0].equals("Refuel")) {
                if (tokens[1].equals("Car")) {
                    double liters = Double.parseDouble(tokens[2]);
                    car.refuel(liters);
                } else if (tokens[1].equals("Truck")) {
                    double liters = Double.parseDouble(tokens[2]);
                    truck.refuel(liters);
                }
            }
        }
        System.out.printf("Car: %.2f%n", car.getQuantity());
        System.out.printf("Truck: %.2f", truck.getQuantity());
    }

}





















