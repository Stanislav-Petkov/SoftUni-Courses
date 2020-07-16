import java.util.Scanner;

public class Travelling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!"End".equals(destination)) {
            int targetMoney = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            while (sum < targetMoney) {
                int savedMoneyOnce = Integer.parseInt(scanner.nextLine());
                sum = sum + savedMoneyOnce;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
