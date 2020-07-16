package carShopExtend2;

import java.io.Serializable;

public class Seat extends CarImpl implements Car, Serializable, Sellable {

    private static final long serialVersionUID = 2L;

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
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

    //This is Leon produced in Spain and have 4 tires
    //Leon sells for 11111,100000
    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires%n" +
                        "%s sells for %f",
                this.getModel(), this.countryProduced(), Car.TIRES,
                this.getModel(), this.getPrice());
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
