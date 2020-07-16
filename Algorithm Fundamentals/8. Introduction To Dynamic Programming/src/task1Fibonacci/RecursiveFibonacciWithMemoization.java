package task1Fibonacci;

import java.util.Scanner;

public class RecursiveFibonacciWithMemoization {

    public static long[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        dp = new long[n + 1];
        long num = fib(n);
        System.out.println(num);
    }

    /*
    position  0 1 2 3 4 5 6 7
     value    0 1 1 2 3 5 8 13
     */

    private static long fib(int n) {
        if(n <= 2) {
            return 1;
        }

        if(dp[n] != 0){
            // If there is a saved value for n, return it
            return dp[n];
        }

        // If there is not a saved value for n , save the current value
        return dp[n] = fib(n - 1) + fib(n - 2);
    }
}
