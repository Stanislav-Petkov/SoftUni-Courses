package vehicleExtensions2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehiclesByType = new LinkedHashMap<>();

        vehiclesByType.put("Car", new Car(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        input = scanner.nextLine().split("\\s+");

        vehiclesByType.put("Truck", new Truck(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        input = scanner.nextLine().split("\\s+");


        vehiclesByType.put("Bus", new Bus(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[1];
            double param = Double.parseDouble(tokens[2]);
            String command = tokens[0];
            if (command.equals("Drive") && type.equals("Bus")) {
                System.out.println(((Bus) vehiclesByType.get("Bus")).driveWithPassengers(param));
            } else if (command.contains("Drive")) {
                System.out.println(vehiclesByType.get(type).drive(param));
            } else if (command.equals("Refuel")) {
                try {
                    vehiclesByType.get(type).refuel(param);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        for (Vehicle vehicle1 : vehiclesByType.values()) {
            System.out.println(vehicle1.toString());
        }
    }
}












/*
package garage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

      //  Map<String, Vehicle> vehiclesByType = new HashMap<>();

        Car car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));

        //vehiclesByType.put("Car",)
        input = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens[0].equals("Drive")) {
                System.out.println(driveCorrectVehicle(tokens[1], car, truck, Double.parseDouble(tokens[2])));
            } else {
                refuelCorrectVehicle(tokens[1], car, truck, Double.parseDouble(tokens[2]));
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

    private static void refuelCorrectVehicle(String type, Car car, Truck truck, double quantity) {
        if (type.equals("Car")) {
            car.refuel(quantity);
        } else {
            truck.refuel(quantity);

        }

    }

    private static String driveCorrectVehicle(String type, Car car, Truck truck, double distance) {
        if (type.equals("Car")) {
            return car.drive(distance);
        }
        return truck.drive(distance);

    }
}

















 */



