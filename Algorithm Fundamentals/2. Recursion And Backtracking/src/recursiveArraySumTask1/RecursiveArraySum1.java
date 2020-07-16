package recursiveArraySumTask1;


import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumTwo = sumNumbers(arr, 0);
        System.out.println(sumTwo);

    }

    private static int sumNumbers(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }

        //sum the value of current index with with value of the next index
        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
