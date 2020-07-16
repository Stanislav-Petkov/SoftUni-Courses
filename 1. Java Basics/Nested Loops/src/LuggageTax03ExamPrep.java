import java.util.Scanner;

public class LuggageTax03ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        String bilet = scanner.nextLine();
        int sum = a * b * c;
        int price = 0;
        if (bilet.equals("true")) {
            if (sum >= 50 && sum <= 100) {
                price = 0;
            } else if (sum >= 100 && sum <= 200) {
                price = 10;
            } else if (sum >= 200 && sum <= 300) {
                price = 20;
            }
        } else if (bilet.equals("false")) {
            if (sum >= 50 && sum <= 100) {
                price = 25;
            } else if (sum >= 100 && sum <= 200) {
                price = 50;
            } else if (sum >= 200 && sum <= 300) {
                price = 100;
            }
        }
        double result = price;
        System.out.printf("Luggage tax: %.2f", result);
    }
}
