package recursiveFactorialTask4;

import java.util.Scanner;

public class Factorial4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long result = recursiveFactorial(n);
        System.out.println(result);
    }

    private static long recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}
