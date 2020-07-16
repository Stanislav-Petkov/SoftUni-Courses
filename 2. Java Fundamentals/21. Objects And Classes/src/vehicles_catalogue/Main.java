package vehicles_catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class VehicleCatalogue {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        VehicleCatalogue(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    capitalize(this.type), this.model, this.color, this.horsepower);
        }

        public static String capitalize(String str) {

            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<VehicleCatalogue> allVehicles = new ArrayList<>();
        List<VehicleCatalogue> cars = new ArrayList<>();
        List<VehicleCatalogue> trucks = new ArrayList<>();
        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            String[] parts = input.split(" ");
            String type = parts[0];
            String model = parts[1];
            String color = parts[2];
            int horsepower = Integer.parseInt(parts[3]);
            VehicleCatalogue vehicle = new VehicleCatalogue(type, model, color, horsepower);
            if (type.equals("car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }
            allVehicles.add(vehicle);
        }
        String string;
        while (!"Close the Catalogue".equals(string = scanner.nextLine())) {
            for (VehicleCatalogue vehicle : allVehicles) {
                System.out.println(vehicle.toString());
                break;
            }
        }
        double sumCars = 0;
        for (VehicleCatalogue car : cars) {
            sumCars += car.getHorsepower();
        }
        if (sumCars != 0) {
            System.out.println(String.format("Cars have average horsepower of: %.2f.", sumCars / cars.size()));
        } else {
            System.out.println(String.format("Cars have average horsepower of: 0.00."));
        }
        double sumTruck = 0;
        for (VehicleCatalogue truck : trucks) {
            sumTruck += truck.getHorsepower();
        }
        if (sumTruck != 0) {
            System.out.print(String.format("Trucks have average horsepower of: %.2f.%n", sumTruck / trucks.size()));
        } else {
            System.out.print(String.format("Trucks have average horsepower of: 0.00.%n"));
        }
    }
}
