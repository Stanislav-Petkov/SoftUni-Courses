import java.util.Scanner;

public class Vacation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double money = 0;
        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                money += 8.45;
            } else if (day.equals("Saturday")) {
                money += 9.80;
            } else if (day.equals("Sunday")) {
                money += 10.46;
            }
        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                money += 10.90;
            } else if (day.equals("Saturday")) {
                money += 15.6;
            } else if (day.equals("Sunday")) {
                money += 16;
            }
        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                money += 15;
            } else if (day.equals("Saturday")) {
                money += 20;
            } else if (day.equals("Sunday")) {
                money += 22.5;
            }
        }
        if (type.equals("Students") && n >= 30) {
            money = 0.85 * (money * n);
            System.out.printf("Total price: %.2f", money);
        } else if (type.equals("Business") && n >= 100) {
            n = n - 10;
            money = (money * n);
            System.out.printf("Total price: %.2f", money);
        } else if (type.equals("Regular") && n >= 10 && n <= 20) {
            money = 0.95 * (money * n);
            System.out.printf("Total price: %.2f", money);
        } else {
            System.out.printf("Total price: %.2f", money * n);
        }
    }
}
