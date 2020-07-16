
package task2LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftMostLongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //int[] sequence = { 3, 14, 5, 12, 15, 7, 8, 9, 11, 10, 1 };
        int maxLength = 0;
        int maxIndex = -1; // The index with the max LIS
        // When I find a subsequence bigger than the previous longest subsequence, I save from which index I have came to it
        int[] prev = new int[sequence.length];
        Arrays.fill(prev, -1);

        // Stores the longest increasing subsequence value for the given index
        int[] length = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            int current = sequence[i];
            int bestLength = 1;
            int bestIndex = -1;
            // For the current element look at every element before it. Check for every lower element
            // if the sum of the current + the length saved for the previous lower elements gives
            // a better increasing subsequence
            for (int j = i - 1; j >= 0; j--) {
                if (sequence[j] < current && length[j] + 1 >= bestLength) {
                    bestLength = length[j] + 1;
                    bestIndex = j;
                }
            }
            // In prev from current index I save the best length of the current index
            prev[i] = bestIndex;
            length[i] = bestLength;
            // Get the index of the biggest overall increasing sequence
            if (maxLength < bestLength) {
                maxLength = bestLength;
                maxIndex = i;
            }
        }
        //System.out.println(Arrays.stream(length).max().getAsInt());

        List<Integer> LIS = new ArrayList<>();
        int index = maxIndex;
        while (index != -1) {
            LIS.add(sequence[index]);
            index = prev[index];
        }

        for (int i = LIS.size() - 1; i >= 0; i--) {
            System.out.print(LIS.get(i) + " ");
        }

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < length.length; i++) {
//            if (length[i] > max) {
//                max = length[i];
//            }
//        }
//        System.out.println(max);
    }

}
