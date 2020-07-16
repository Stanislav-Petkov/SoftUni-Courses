package hotelReservation.domain;

public class Reservation {

    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discount;

    public Reservation(double pricePerDay, int numberOfDays,
                       Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice() {
        double price = pricePerDay * numberOfDays;
        price = season.getPriceMultiplied(price);
        price = discount.discountedPrice(price);
        return price;
    }
}


