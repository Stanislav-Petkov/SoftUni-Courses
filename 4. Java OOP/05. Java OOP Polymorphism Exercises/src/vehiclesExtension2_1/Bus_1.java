package vehiclesExtension2_1;

public class Bus_1 extends Vehicle_1 {
    private static final double AIR_CONDITIONER = 1.4;

    Bus_1(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel, fuelConsumption + 1.4, tankCapacity);
    }

    @Override
    public String driveBusEmpty(double distance) {
        return "Bus" + super.driveBusEmpty(distance);

    }

    @Override
    public String drive(double distance) {
        return "Bus" + super.drive(distance);
    }

    @Override
    public void refuel(double quantity) {
        super.refuel(quantity);
    }

    @Override
    public String toString() {
        return "Bus" + super.toString();
    }
}
