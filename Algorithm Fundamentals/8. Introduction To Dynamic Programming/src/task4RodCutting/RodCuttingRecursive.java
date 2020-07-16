package task4RodCutting;

import java.util.Arrays;
import java.util.Scanner;

public class RodCuttingRecursive {

    public static int[] bestPrices;
    public static int[] prevIndex; // Stores the previous paths
    public static int[] prices;

    public static void main(String[] args) {
        /*
        Find the best way to cut up a rod with a specified length.
         You are also given to prices of all possible lengths starting from 0.
         */
        Scanner scanner = new Scanner(System.in);
        prices = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // The length of the rod
        int length = Integer.parseInt(scanner.nextLine());

        bestPrices = new int[length + 1];
        prevIndex = new int[length + 1];

        int maxProfit = cutRope(length);

        System.out.println(maxProfit);

        reconstructSolution(length);
    }

    private static int cutRope(int length) {
        if(length == 0){
            return 0;
        }
        if(bestPrices[length] != 0){
            return bestPrices[length];
        }
        // Get the current best price
        int currentBest = bestPrices[length];

        // Iterate the parts from 1 up to what is left
        for (int currLength = 1; currLength <= length; currLength++) {
            // Get the best price up to this moment + cut the rope for the left pieces
            // prices[currLength]  is the price at which the current length costs
            // cutRope(length - currLength) this is called to know how many elements are left
            // cutRope() if I cut the rope for the left pieces
            // currLength is the current length which I want to take from the current length
            currentBest = Math.max(currentBest, prices[currLength] + cutRope(length - currLength));
            int bestPrice = bestPrices[length];
            if(currentBest > bestPrice){
                bestPrices[length] = currentBest;
                prevIndex[length] = currLength;
            }
        }
        return bestPrices[length];
    }
    private static void reconstructSolution(int length){
        // For the length that we are searching we subtract the prevIndex[length] so that we can see
        // for which of the prices it was printed
        while (length - prevIndex[length] != 0){
            // Print from which previous length we have taken
            System.out.print(prevIndex[length] + " ");
            length = length - prevIndex[length];
        }
        System.out.println(prevIndex[length]);
    }
}
















