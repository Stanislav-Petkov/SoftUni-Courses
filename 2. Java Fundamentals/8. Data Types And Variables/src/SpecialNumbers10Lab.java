
import java.util.Scanner;

class SpecialNumbers10Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        for (int digit = 1; digit <= n; digit++) {
            int var = digit;
            int total = 0;
            while (digit > 0) {
                total += digit % 10;
                digit = digit / 10;
            }
            if ((total == 5) || (total == 7) || (total == 11)) {
                System.out.printf("%d -> True %n", var);
            } else {
                System.out.printf("%d -> False %n", var);
            }
            total = 0;
            digit = var;
        }
    }
}




