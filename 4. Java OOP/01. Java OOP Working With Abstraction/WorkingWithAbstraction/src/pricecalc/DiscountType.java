package pricecalc;

public enum DiscountType {
    VIP(0.2, " a real vip"),
    SECOND_VISIT(0.1, " second visitor "),
    NONE(0.0, "nope");

    private double discount;
    private String message;

    DiscountType(double discount, String message) {
        this.discount = discount;
        this.message = message;
    }

    DiscountType() {
        this.discount = 0.0;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    public double discountFor(double amount) {
        double discount = amount * this.discount;
        return amount - discount;
    }

    public double getDiscount() {
        return this.discount;
    }

    public static void main(String[] args) {
        VIP.printMessage();
        NONE.printMessage();
    }
}




