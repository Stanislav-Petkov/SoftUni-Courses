
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GreedyAlgorithmSumOfCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        // Value of a coin, count of coins
        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        Map<Integer, Integer> usedCoins = new LinkedHashMap<>();

        // Index starting from the biggest coin
        int index = coins.length - 1;

        while (targetSum != 0){
            // How many coins can be taken on the current index
            int coinsToTake = targetSum / coins[index];
            if(coinsToTake != 0){
                usedCoins.put(coins[index],coinsToTake);
            }
            targetSum %= coins[index];
            index--;
        }

        return usedCoins;
    }
}















