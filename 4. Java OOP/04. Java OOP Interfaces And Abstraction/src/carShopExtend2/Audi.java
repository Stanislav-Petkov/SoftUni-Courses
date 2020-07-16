package carShopExtend2;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model,
                String color,
                Integer horsePower,
                String countryProduced,
                Integer minRentDay,
                Double pricePerDay) {
        super(model, color, horsePower, countryProduced);

        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    public static int audiFoo() {
        return 24;
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Integer getHorsePower() {
        return super.getHorsePower();
    }


    @Override
    public String countryProduced() {
        return super.countryProduced();
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String frontBumper() {
        return "Audi Plastic bumper";
    }

    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires%n" +
                        "Minimum rental period of %d days. Price per day %f",
                this.getModel(), this.countryProduced(), Car.TIRES,
                this.getMinRentDay(), this.getPricePerDay());
    }
}
