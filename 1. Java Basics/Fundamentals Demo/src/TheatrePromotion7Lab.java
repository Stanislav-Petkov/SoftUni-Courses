import java.util.Scanner;

public class TheatrePromotion7Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int year = scanner.nextInt();
        int price = 0;
        if (day.equals("Weekday")) {
            if (year >= 0 && year <= 18) {
                price = 12;
            } else if (year > 18 && year <= 64) {
                price = 18;
            } else if (year > 64 && year <= 122) {
                price = 12;
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("Weekend")) {
            if (year >= 0 && year <= 18) {
                price = 15;
            } else if (year > 18 && year <= 64) {
                price = 20;
            } else if (year > 64 && year <= 122) {
                price = 15;
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("Holiday")) {
            if (year >= 0 && year <= 18) {
                price = 5;
            } else if (year > 18 && year <= 64) {
                price = 12;
            } else if (year > 64 && year <= 122) {
                price = 10;
            } else {
                System.out.println("Error!");
            }
        }
        if (year >= 0 && year <= 122)
            System.out.printf("%d$", price);
    }
}
