package task2LongestZigZagSequence;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class lzzs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] dp = new int[numbers.length + 1][2];
        int[][] prev = new int[numbers.length + 1][2];

        // dp col 0 stores the current best zig zag length if the current number is bigger then previous
        // dp col 1 stores the current best zig zag length if the current number is lower then previous

        //Are Greater
        dp[0][0] = 1;
        //Are lesser
        dp[0][1] = 1;

        prev[0][0] = -1;
        prev[0][1] = -1;

        int maxLength = 0;

        //on which best[0] - row/index and best[1] - on which col the best solution was found
        int[] best = new int[2];

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            for (int prevIndex = currentIndex - 1; prevIndex >= 0; prevIndex--) {
                int prevNumber = numbers[prevIndex];
                // When we meet a better value, it should be saved
                // The current saved as longest zig zag subsequence is in dp[currentIndex][0] should be
                // lower than dp[prevIndex][1] + 1
                // dp[prevIndex] returns the previ
                // ous number index
                int cig = dp[currentIndex][0];
                int pil = dp[prevIndex][1];
                if (currentNumber > prevNumber && cig <= pil + 1) {
                    // The greater numbers are on the 0-th index
                    // Look at the lesser numbers
                    // When we want to upgrade the value in greater [][0] we should take the previous one from lesser[][1]
                    // because its neighbour should be lower
                    // the current numb on the left is lower than the currNum
                    dp[currentIndex][0] = dp[prevIndex][1] + 1;
                    // fill for the current number from where I came
                    // fill in the current index where I have found it - in the previndex
                    prev[currentIndex][0] = prevIndex;
                }
                int ci = dp[currentIndex][1];
                int pi = dp[prevIndex][0];
                if (currentNumber < prevNumber && ci <= +pi + 1) {
                    dp[currentIndex][1] = dp[prevIndex][0] + 1;
                    prev[currentIndex][1] = prevIndex;
                }
            }

            // Overwrite when a better value is found
            if(maxLength < dp[currentIndex][0]){
                maxLength = dp[currentIndex][0];
                best[0] = currentIndex;
                best[1] = 0;
            }else if(maxLength < dp[currentIndex][1]){
                maxLength = dp[currentIndex][1];
                best[0] = currentIndex;
                best[1] = 1;
            }
        }

        Deque<Integer> zigZagSequence = new ArrayDeque<>();

        // on this index I have found the longest zig zag sequence
        int beginRow = best[0];
        while (beginRow >= 0){
            zigZagSequence.push(numbers[beginRow]);
            // prev stores where I should go
            beginRow = prev[beginRow][best[1]];
            // best stores where I found the previous best value as index
            // If I came from 0 return 1
            best[1] = best[1] == 0 ? 1 : 0;

        }
        // the result is zig zag sequence bigger lower bigger lower bigger ...
        // Example 8 3 5 7 0 8 9 10 20 20 20 12 19 11
        // Result: 8 3 5 0 20 12 19 11 - length 8

        while (!zigZagSequence.isEmpty()){
            System.out.print(zigZagSequence.pop() + " ");
        }

    }
}

