import java.util.Scanner;

public class SumPrimeNonPrime04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int currentInt = Integer.parseInt("" + input);
            if (currentInt < 0) {
                System.out.println("Number is negative.");
            }
            if (currentInt >= 0) {
                boolean flag = false;
                for (int i = 2; i <= currentInt / 2; ++i) {
                    if (currentInt % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    primeSum += currentInt;
                } else {
                    nonPrimeSum += currentInt;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}
