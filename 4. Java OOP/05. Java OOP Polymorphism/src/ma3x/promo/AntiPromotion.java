package ma3x.promo;

public class AntiPromotion extends Promotion {
    @Override
    public Double calculateFor(Double price) {
        return price * 2;
    }
}
