import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long resultIterative = iterativeFactorial(n);
        System.out.println(resultIterative);
        long result = recursiveFactorial(n);
        System.out.println(result);
    }

    private static long recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    private static long iterativeFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
