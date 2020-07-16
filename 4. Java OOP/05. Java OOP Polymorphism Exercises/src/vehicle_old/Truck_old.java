package vehicle_old;

import java.text.DecimalFormat;

public class Truck_old implements Vehicle_old {
    double fuelQuantity;
    double consumptionOfLitersPerKm;

    Truck_old(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.consumptionOfLitersPerKm = litersPerKm + 1.6;
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
            System.out.printf("Truck travelled " + df2.format(distance) + " km%n");
            this.fuelQuantity -= this.consumptionOfLitersPerKm * distance;
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity = this.fuelQuantity + (liters * 0.95);
    }

}
