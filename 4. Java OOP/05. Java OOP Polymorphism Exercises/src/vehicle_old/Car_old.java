package vehicle_old;

import java.text.DecimalFormat;

public class Car_old implements Vehicle_old {
    double fuelQuantity;
    double consumptionOfLitersPerKm;

    Car_old(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.consumptionOfLitersPerKm = litersPerKm + 0.9;
    }

    @Override
    public double getQuantity() {
        return this.fuelQuantity;
    }

    @Override
    public double getConsumption() {
        return this.consumptionOfLitersPerKm;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    public void canItDriveThisMuch(double distance) {
        if (this.fuelQuantity >= this.consumptionOfLitersPerKm * distance) {
            System.out.printf("Car travelled " + df2.format(distance) + " km%n");
            this.fuelQuantity -= this.getConsumption() * distance;
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity = this.fuelQuantity + liters;
    }
}
