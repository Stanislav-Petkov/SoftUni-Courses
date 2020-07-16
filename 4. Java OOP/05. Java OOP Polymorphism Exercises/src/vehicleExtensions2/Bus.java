package vehicleExtensions2;

public class Bus extends Vehicle {

    Bus(double fuel, double fuelConsumption, int capacity) {
        super(fuel, fuelConsumption, capacity);
    }

    @Override
    public String drive(double distance) {
        return "Bus" + super.drive(distance);
    }

    public String driveWithPassengers(double distance) {
        return super.driveWithIncreasedConsumption(distance, 1.4);
    }

    @Override
    public String toString() {
        return "Bus" + super.toString();
    }
}
