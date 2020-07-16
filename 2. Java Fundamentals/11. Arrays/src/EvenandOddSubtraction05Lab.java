import java.util.Scanner;

public class EvenandOddSubtraction05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersLine = scanner.nextLine();
        String[] numberStrings = numbersLine.split(" ");
        int[] arr = new int[numberStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numberStrings[i]);
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
