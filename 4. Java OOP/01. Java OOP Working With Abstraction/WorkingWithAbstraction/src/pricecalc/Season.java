package pricecalc;

public enum Season {
    AUTUMN(1),
    WINTER(2),
    SPRING(3),
    SUMMER(4);

    int priceMultiplier;

    Season(int priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }
}
