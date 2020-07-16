import java.util.Scanner;

public class MultiplyEvensbyOdds10Lab {
    static int getMultipleOfEvensAndOdds(int a) {
        return getSumOfOdd(a) * getSumOfEven(a);
    }

    static int getSumOfOdd(int a) {
        int digit = 0;
        int sum = 0;
        while (a > 0) {
            digit = a % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            a = a / 10;
        }
        return sum;
    }

    static int getSumOfEven(int a) {
        int digit = 0;
        int sum = 0;
        while (a > 0) {
            digit = a % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int abs = Math.abs(input);
        int result = getMultipleOfEvensAndOdds(abs);
        System.out.println(result);
    }
}
