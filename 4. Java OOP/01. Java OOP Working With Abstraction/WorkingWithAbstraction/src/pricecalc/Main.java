package pricecalc;

public class Main {
    public static void main(String[] args) {
        for (DiscountType value : DiscountType.values()) {
            System.out.println(value);
            System.out.println(value.discountFor(15));
        }

        for (DiscountType value : DiscountType.values()) {
            value.printMessage();
        }
    }
}
