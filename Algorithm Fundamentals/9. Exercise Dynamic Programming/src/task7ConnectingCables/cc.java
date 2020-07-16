package task7ConnectingCables;

import java.util.Arrays;
import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cables = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] destinations = new int[cables.length];
        for (int i = 0; i < cables.length; i++) {
            destinations[i] = i + 1;
        }
        int[][] dp = new int[cables.length + 1][cables.length + 1];
        for (int i = 1; i <= cables.length; i++) {
            for (int j = 1; j <= cables.length ; j++) {
                if(cables[i - 1] == destinations[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[cables.length][cables.length]);
    }
}
