package vehicle_old;

public interface Vehicle_old {
    abstract double getQuantity();

    abstract double getConsumption();

    void canItDriveThisMuch(double distance);

    void refuel(double liters);
}