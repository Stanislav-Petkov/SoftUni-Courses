import java.util.Scanner;

public class AExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moshtnost = Double.parseDouble(scanner.nextLine());
        String grad = scanner.nextLine();
        String eco = scanner.nextLine();
        double price = 0;
        if (moshtnost <= 37) {
            if (grad.equals("Sofia")) {
                price = moshtnost * 1.43;
            } else if (grad.equals("Vidin")) {
                price = moshtnost * 1.34;
            } else if (grad.equals("Varna")) {
                price = moshtnost * 1.37;
            }
        } else if (moshtnost >= 38 && moshtnost <= 55) {
            if (grad.equals("Sofia")) {
                price = moshtnost * 1.5;
            } else if (grad.equals("Vidin")) {
                price = moshtnost * 1.4;
            } else if (grad.equals("Varna")) {
                price = moshtnost * 1.4;
            }
        } else if (moshtnost > 55) {
            if (grad.equals("Sofia")) {
                price = moshtnost * 2.68;
            } else if (grad.equals("Vidin")) {
                price = moshtnost * 2.54;
            } else if (grad.equals("Varna")) {
                price = moshtnost * 2.57;
            }
        }
        if (eco.equals("Euro 4")) {
            price = price * 0.85;
        } else if (eco.equals("Euro 5")) {
            price = price * 0.83;
        } else if (eco.equals("Euro 6")) {
            price = price * 0.8;
        }
        System.out.printf("%.2f lv", price);
    }
}
