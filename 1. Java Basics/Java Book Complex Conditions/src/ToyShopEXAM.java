import java.util.Scanner;

public class ToyShopEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double numberOfToys = puzzle + doll + bear + minion + truck;
        double tempPrice = puzzle * 2.6 + doll * 3 + bear * 4.1 + minion * 8.2 + truck * 2;
        double finalPrice = 0;
        double finalePrice = 0;
        if (numberOfToys >= 50) {
            finalPrice = tempPrice - (tempPrice * 0.25);
            finalePrice = finalPrice - finalPrice * 0.1;
        } else {
            finalPrice = tempPrice;
            finalePrice = finalPrice - finalPrice * 0.1;
        }
        if (finalePrice >= price) {
            System.out.printf("Yes! %.2f lv left.", finalePrice - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - finalePrice);
        }
    }
}
