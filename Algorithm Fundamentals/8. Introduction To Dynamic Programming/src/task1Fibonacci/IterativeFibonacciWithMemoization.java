package task1Fibonacci;

import java.util.Scanner;

public class IterativeFibonacciWithMemoization {
    public static long[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        /*
        position  0 1 2 3 4 5 6 7
         value    0 1 1 2 3 5 8 13
     */

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
