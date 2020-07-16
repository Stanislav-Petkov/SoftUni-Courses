package hotelReservation.domain;

public enum Discount {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0.0);

    double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        double discount = price * this.discount;
        return price - discount;
    }

}

