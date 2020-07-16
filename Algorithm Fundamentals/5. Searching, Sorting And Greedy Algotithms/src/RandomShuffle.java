import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {13, 15, 12, 24, 59};

        Arrays.sort(arr);

        int[] random = getAsRand(arr);

        for (int rand : random) {
            System.out.print(rand + " ");
        }
    }

    private static int[] getAsRand(int[] arr) {
        int[] result = new int[arr.length];

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[threadLocalRandom.nextInt(arr.length)];
        }

        return result;
    }
}














