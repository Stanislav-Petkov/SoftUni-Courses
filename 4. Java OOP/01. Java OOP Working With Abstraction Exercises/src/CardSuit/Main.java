package CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Card Suits:");
        CardSuit[] values = CardSuit.values();
        for (int i = 0; i < values.length; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", values[i].ordinal(), values[i]);
        }
    }
}
