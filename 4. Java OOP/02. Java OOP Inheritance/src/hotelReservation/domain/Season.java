package hotelReservation.domain;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    int priceMultiplier;

    Season(int priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public int getPriceMultiplier() {
        return priceMultiplier;
    }

    public double getPriceMultiplied(double price) {
        return price * priceMultiplier;
    }
}











/*
package hotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int priceMultiplier;

    Season(int priceMultiplier){
        this.priceMultiplier = priceMultiplier;
    }

    public double multipliedPrice(double price){
        return price * this.priceMultiplier;
    }


    public int getPriceMultiplier(){
        return this.priceMultiplier;
    }
}














 */

