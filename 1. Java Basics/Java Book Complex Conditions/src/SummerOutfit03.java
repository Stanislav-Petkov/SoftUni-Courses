import java.util.Scanner;

public class SummerOutfit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersKind = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (flowersKind.equals("Roses")) {
            if (numberOfFlowers > 80) {
                price = (numberOfFlowers * 5) * 0.9;
            } else {
                price = numberOfFlowers * 5;
            }
        } else if (flowersKind.equals("Dahlias")) {
            if (numberOfFlowers > 90) {
                price = (numberOfFlowers * 3.8) * 0.85;
            } else {
                price = numberOfFlowers * 3.8;
            }
        } else if (flowersKind.equals("Tulips")) {
            if (numberOfFlowers > 80) {
                price = (numberOfFlowers * 2.8) * 0.85;
            } else {
                price = numberOfFlowers * 2.8;
            }
        } else if (flowersKind.equals("Narcissus")) {
            if (numberOfFlowers < 120) {
                price = (numberOfFlowers * 3) * 1.15;
            } else {
                price = numberOfFlowers * 3;
            }
        } else if (flowersKind.equals("Gladiolus")) {
            if (numberOfFlowers < 80) {
                price = (numberOfFlowers * 2.5) * 1.2;
            } else {
                price = numberOfFlowers * 2.5;
            }
        }
        if (budget >= price) {
            System.out.printf(
                    "Hey, you have a great garden with %d %s and %.2f leva left.",
                    numberOfFlowers, flowersKind, budget - price);
        } else {
            System.out.printf(
                    "Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}

