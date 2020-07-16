import java.util.Scanner;

public class ChristmasDecorationExamPrep06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += input.charAt(i);
            }
            if (budget - sum >= 0) {
                budget = budget - sum;
                System.out.println("Item successfully purchased!");
            } else {
                System.out.println("Not enough money!");
                break;
            }
            input = scanner.nextLine();
        }
        if ("Stop".equals(input)) {
            System.out.printf("Money left: %.0f", budget);
        }
    }
}
