import java.util.Scanner;

public class CoffeeMachine03ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        double drinkCnt = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = drinkCnt * 0.9;
            } else if (sugar.equals("Normal")) {
                price = drinkCnt * 1;
            } else if (sugar.equals("Extra")) {
                price = drinkCnt * 1.2;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = drinkCnt * 1;
            } else if (sugar.equals("Normal")) {
                price = drinkCnt * 1.2;
            } else if (sugar.equals("Extra")) {
                price = drinkCnt * 1.6;
            }
        } else if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = drinkCnt * 0.5;
            } else if (sugar.equals("Normal")) {
                price = drinkCnt * 0.6;
            } else if (sugar.equals("Extra")) {
                price = drinkCnt * 0.7;
            }
        }
        double finalPrice = 0;
        if (sugar.equals("Without")) {
            finalPrice = price - price * 0.35;
        }
        if (drink.equals("Espresso") && drinkCnt >= 5) {
            finalPrice = finalPrice * 0.75;
        }
        if (price >= 15 || finalPrice >= 15) {
            finalPrice = price * 0.8;
        }
        if (!(price >= 15) && !(drink.equals("Espresso") && drinkCnt >= 5) && !(sugar.equals("Without"))) {
            System.out.printf("You bought %.0f cups of %s for %.2f lv.", drinkCnt, drink, price);
        } else {
            System.out.printf("You bought %.0f cups of %s for %.2f lv.", drinkCnt, drink, finalPrice);
        }
    }
}
