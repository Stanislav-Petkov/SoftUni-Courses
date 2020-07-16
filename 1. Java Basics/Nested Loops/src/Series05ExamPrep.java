import java.util.Scanner;

public class Series05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double seriesCnt = Double.parseDouble(scanner.nextLine());
        String name = "";
        double price = 0.0;
        double totalPrice = 0;
        for (int i = 0; i < seriesCnt; i++) {
            name = scanner.nextLine();
            price = Double.parseDouble(scanner.nextLine());
            if (name.equals("Thrones")) {
                totalPrice = totalPrice + price * 0.5;
            } else if (name.equals("Lucifer")) {
                totalPrice = totalPrice + price * 0.6;
            } else if (name.equals("Protector")) {
                totalPrice = totalPrice + price * 0.7;
            } else if (name.equals("TotalDrama")) {
                totalPrice = totalPrice + price * 0.8;
            } else if (name.equals("Area")) {
                totalPrice = totalPrice + price * 0.9;
            } else {
                totalPrice = totalPrice + price;
            }
        }
        if (totalPrice <= budget) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
