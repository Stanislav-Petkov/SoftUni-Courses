
import java.util.Scanner;

public class AccountBalance04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double current = 0;
        int counter = 1;
        while (n >= counter) {
            current = Double.parseDouble(scanner.nextLine());
            if (current < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", current);
            total = total + current;
            counter++;
        }
        System.out.printf("Total: %.2f", total);
    }
}
