package task4SumWithUnlimitedAmountOfCoins;

import java.util.Arrays;
import java.util.Scanner;

public class SumWithUnlimitedAmountOfCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coins = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetSum = Integer.parseInt(scanner.nextLine());

        //Count all the ways by which the target sum can be reached

        // stores the number of combinations by which the target sum can be taken
        int[] dp = new int[targetSum + 1];

        // the 0 index is if there is no targetSum return 1
        dp[0] = 1;

        // Get all coins, for each coin and the remaining coins from it, check in what way we can take the remaining
        // coins
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= targetSum; j++) {
                // Starts from the current coin, I want to reach the target sum and the loop goes to it
                // When I pick coin with value 6 in the dp, I should aggregate according to the previous coins
                // When j is increasing I should go through every coin
                int currCoin = coins[i];
                dp[j] = dp[j] + dp[j - currCoin];
            }
        }

        // The number of possible combinations is saved in dp[targetSum]
        System.out.println(dp[targetSum]);
    }
}
