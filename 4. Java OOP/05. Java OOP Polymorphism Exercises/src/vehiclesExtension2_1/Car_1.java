package vehiclesExtension2_1;

public class Car_1 extends Vehicle_1 {
    private static final double AIR_CONDITIONER = 0.9;

    Car_1(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel, fuelConsumption + AIR_CONDITIONER, tankCapacity);
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
