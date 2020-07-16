import java.util.Scanner;

public class ReverseArrayofStrings04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersLine = scanner.nextLine();
        String[] numberStrings = numbersLine.split(" ");
        String[] arr = new String[numberStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numberStrings[i];
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int oppositeIndex = arr.length - 1 - i;
            String oldNumberI = arr[i];
            arr[i] = arr[oppositeIndex];
            arr[oppositeIndex] = oldNumberI;
        }
        printArray(arr);
    }

    private static void printArray(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
