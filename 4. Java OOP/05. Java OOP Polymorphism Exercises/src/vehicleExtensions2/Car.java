package vehicleExtensions2;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER = 0.9;

    Car(double fuel, double fuelConsumption, int capacity) {
        super(fuel, fuelConsumption + AIR_CONDITIONER, capacity);
    }

    @Override
    public String drive(double distance) {
        return "Car" + super.drive(distance);
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
