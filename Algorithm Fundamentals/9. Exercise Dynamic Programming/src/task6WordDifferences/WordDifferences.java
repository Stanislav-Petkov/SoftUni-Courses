package task6WordDifferences;

import java.util.Scanner;

public class WordDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] first = scanner.nextLine().toCharArray();
        char[] second = scanner.nextLine().toCharArray();
        
        int[][] dp = new  int[first.length + 1][second.length + 1];
        for (int i = 0; i <= first.length; i++) {
            for (int j = 0; j <= second.length ; j++) {
                if(i == 0){
                    // fill the 0-th col
                    dp[i][j] = j;
                }else if(j == 0){
                    // fill the 0-th row
                    dp[i][j] = i;
                }else if(first[i - 1] == second[j - 1]){
                    // get from the last time when the string was changed without adding anything, which is on the diagonal
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    // here happens either the insertion or the deletion
                    // get the value from the top and from the left
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        System.out.println("Deletions and Insertions: " + dp[first.length][second.length]);
    }
}
