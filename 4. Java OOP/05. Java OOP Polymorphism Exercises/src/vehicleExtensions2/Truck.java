package vehicleExtensions2;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER = 1.6;

    Truck(double fuel, double fuelConsumption, int capacity) {
        super(fuel, fuelConsumption + AIR_CONDITIONER, capacity);
    }

    @Override
    public String drive(double distance) {
        return "Truck" + super.drive(distance);
    }

    @Override
    public void refuel(double quantity) {
        super.refuel(quantity * 0.95);
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
