package garage;

public class Truck_1 extends Vehicle_1 {
    private static final double AIR_CONDITIONER = 1.6;

    Truck_1(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption + AIR_CONDITIONER);
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
