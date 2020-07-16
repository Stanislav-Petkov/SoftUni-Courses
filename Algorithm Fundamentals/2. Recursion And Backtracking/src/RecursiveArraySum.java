import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        iterationSum(arr);
        reverseIterationSum(arr);

        int sumTwo = sumNumbers(arr,0);
        System.out.println("Recursion sum is : " + sumTwo);

        int sumTwoReverse = sumNumbersReverse(arr,arr.length - 1);
        System.out.println("Reverse Recursion sum is : " + sumTwoReverse);
    }

    private static void iterationSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Iteration sum is: " + sum);
    }

    private static void reverseIterationSum(int[] arr) {
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println("Reverse Iteration sum is: " + sum);
    }

    private static int sumNumbers(int[] numbers, int index){
        if(index >= numbers.length){
            return 0;
        }

        //sum the value of current index with with value of the next index
        return numbers[index] + sumNumbers(numbers, index + 1);
    }

    private static int sumNumbersReverse(int[] numbers, int index){
        if(index < 0){
            return 0;
        }

    //sum the value of current index with with value of the previous index
        return numbers[index] + sumNumbersReverse(numbers,index - 1);
    }
}
