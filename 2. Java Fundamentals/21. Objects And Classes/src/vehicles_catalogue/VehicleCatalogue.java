package vehicles_catalogue;

public class VehicleCatalogue {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsepower;

    VehicleCatalogue(String typeOfVehicle, String model, String color, int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f",
                this.typeOfVehicle, this.model, this.color, this.horsepower);
    }
}
