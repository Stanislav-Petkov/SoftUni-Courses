import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        for (int i = 0; i < 3; i++) {
            int digit = scanner.nextInt();
            amount *= 10;
            amount += digit;
            System.out.println(digit);
            System.out.println(amount);
        }
        System.out.println(amount);
    }
}
