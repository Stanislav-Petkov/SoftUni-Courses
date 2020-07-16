package ma3x;

import ma3x.cards.GoldCard;
import ma3x.promo.AntiPromotion;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier(
                new GoldCard(),
                new AntiPromotion());
        System.out.println(cashier.calculateEndPrice(10.0));
    }
}
