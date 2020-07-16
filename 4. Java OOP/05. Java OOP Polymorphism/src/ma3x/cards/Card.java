package ma3x.cards;

public class Card {
    private Double discount;
    public Card(Double discount){
        this.discount = discount;
    }
    public final Double discountedPrice(Double price){
        Double discountSum = price * this.discount;
        return price - discountSum;
    }
}
