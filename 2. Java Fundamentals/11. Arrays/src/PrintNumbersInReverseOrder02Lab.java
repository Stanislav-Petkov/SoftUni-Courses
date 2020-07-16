import java.util.Scanner;

public class PrintNumbersInReverseOrder02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];///{1, 2, 3, 4, 9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());// scanner.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;
            int oldNumberI = numbers[i];
            numbers[i] = numbers[oppositeIndex];
            numbers[oppositeIndex] = oldNumberI;
        }
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
