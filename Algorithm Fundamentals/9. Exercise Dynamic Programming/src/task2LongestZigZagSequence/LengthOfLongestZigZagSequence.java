package task2LongestZigZagSequence;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLongestZigZagSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] dp = new int[numbers.length + 1][2];


        //Are Greater
        dp[0][0] = 1;
        //Are lesser
        dp[0][1] = 1;

        int maxLength = 0;

        for (int currentIndex = 0; currentIndex < numbers.length ; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            for (int prevIndex = currentIndex - 1; prevIndex >= 0; prevIndex--) {
                int prevNumber = numbers[prevIndex];
                // When we meet a better value, it should be saved
                // The current saved as longest zig zag subsequence is in dp[currentIndex][0] should be
                // lower than dp[prevIndex][1] + 1
                // dp[prevIndex] returns the previous number index
                int cig = dp[currentIndex][0];
                int pil = dp[prevIndex][1];
                if(currentNumber > prevNumber && cig <= pil + 1){
                    // The greater numbers are on the 0-th index
                    // Look at the lesser numbers
                    // When we want to upgrade the value in greater [][0] we should take the previous one from lesser[][1]
                    // because its neighbour should be lower
                    // the current numb on the left is lower than the currNum
                    dp[currentIndex][0] = dp[prevIndex][1] + 1;
                }
                int ci = dp[currentIndex][1];
                int pi = dp[prevIndex][0];
                if(currentNumber < prevNumber &&  ci <= + pi + 1){
                    dp[currentIndex][1] = dp[prevIndex][0] + 1;
                }
            }
            int cm = Math.max(dp[currentIndex][0], dp[currentIndex][1]);
            maxLength = Math.max(maxLength, cm);
        }

        // the result is zig zag sequence bigger lower bigger lower bigger ...
        // Example 8 3 5 7 0 8 9 10 20 20 20 12 19 11
        // Result: 8 3 5 0 20 12 19 11 - length 8
        System.out.println(maxLength);
    }
}

/*
package task2LongestZigZagSequence;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLongestZigZagSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] dp = new int[numbers.length + 1][2];


        //Are Greater
        dp[0][0] = 1;
        //Are lesser
        dp[0][1] = 1;

        for (int currentIndex = 0; currentIndex < numbers.length ; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            for (int prevIndex = currentIndex - 1; prevIndex >= 0; prevIndex--) {
                int prevNumber = numbers[prevIndex];
                // When we meet a better value, it should be saved
                // The current saved as longest zig zag subsequence is in dp[currentIndex][0] should be
                // lower than dp[prevIndex][1] + 1
                if(currentNumber > prevNumber && dp[currentIndex][0] < dp[prevIndex][1] + 1){
                    // The greater numbers are on the 0-th index
                    // Look at the lesser numbers
                    // When we want to upgrade the value in greater we should take the previous one from lesser
                    // because its neighbour should be lower
                    dp[currentIndex][0] = dp[prevIndex][1] + 1;
                }
                if(currentNumber < prevNumber && dp[currentIndex][1] < dp[prevIndex][0] + 1){
                    dp[currentIndex][1] = dp[prevIndex][0] + 1;
                }
            }
        }
        System.out.println();
    }
}
 */