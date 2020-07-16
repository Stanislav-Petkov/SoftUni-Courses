package cardrank;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Card Ranks:%n");
        CardRank[] values = CardRank.values();
        for (int i = 0; i < values.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", values[i].ordinal(), values[i]);
        }
    }
}
