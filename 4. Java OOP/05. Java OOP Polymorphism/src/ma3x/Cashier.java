package ma3x;

import ma3x.cards.Card;
import ma3x.promo.Promotion;

public class Cashier {
    private Card card;
    private Promotion promotion;

    Cashier(Card card, Promotion promotion) {
        this.card = card;
        this.promotion = promotion;
    }

    public Double calculateEndPrice(Double price) {
        Double discountedPrice = card.discountedPrice(price);
        return promotion.calculateFor(discountedPrice);
    }
}
