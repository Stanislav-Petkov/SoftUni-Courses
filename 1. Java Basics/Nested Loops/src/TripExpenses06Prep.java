import java.util.Scanner;

public class TripExpenses06Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days = Double.parseDouble(scanner.nextLine());
        double sumMoney = 0;
        double productCnt = 0;
        double ostatuk = 0;
        String productPrice = scanner.nextLine();
        double money = 0;
        double currentOstatusk = 0;
        while (true) {
            if (productPrice.equals("Day over")) {
                ostatuk += 60.0 - sumMoney;
                System.out.printf("Money left from today: %.2f. " +
                        "You've bought %.0f products.%n", ostatuk, productCnt);
            }
            if (!productPrice.equals("Day over")) {
                money = Double.parseDouble("" + productPrice);
            } else {
                money = Double.parseDouble(scanner.nextLine());
                if (money > ostatuk) {
                }
                sumMoney = 0;
                productCnt = 0;
            }
            sumMoney = sumMoney + money;
            productCnt++;
            if (sumMoney >= 60 + ostatuk) {
                if (ostatuk >= 60) {
                    productCnt++;
                }
                System.out.printf("Daily limit exceeded!" +
                        "You've bought %.0f products.%n", productCnt);
                sumMoney = 0;
                productCnt = 0;
            }
            productPrice = scanner.nextLine();
        }
    }
}
