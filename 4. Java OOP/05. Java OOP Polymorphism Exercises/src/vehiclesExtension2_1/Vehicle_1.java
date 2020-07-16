package vehiclesExtension2_1;

import java.text.DecimalFormat;

public abstract class Vehicle_1 {
    private double fuel;
    private double fuelConsumption;
    private double tankCapacity;
    private DecimalFormat formatter;

    Vehicle_1(double fuel, double fuelConsumption, double tankCapacity) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.formatter = new DecimalFormat("##.##");
    }

    public String driveBusEmpty(double distance) {
        this.fuelConsumption -= 1.4;
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded > this.fuel) {
            return " needs refueling";
        }
        this.fuel -= fuelNeeded;
        return " travelled " + formatter.format(distance) + " km";
    }


    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded > this.fuel) {
            return " needs refueling";
        }
        this.fuel -= fuelNeeded;
        return " travelled " + formatter.format(distance) + " km";
    }

    public void refuel(double quantity) {
        if (quantity + this.fuel <= this.tankCapacity && quantity > 0) {
            this.fuel += quantity;
        } else if (quantity <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (quantity + this.fuel > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        }
    }

    @Override
    public String toString() {
        return String.format(": %.2f", this.fuel);
    }

}














