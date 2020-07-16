import java.util.Scanner;

public class PrintingTriangle03Lab {

    static void printRowsOfNumbers(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printRowsOfNumbers(i);
        }
        for (int i = size - 1; i > 0; i--) {
            printRowsOfNumbers(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        printTriangle(size);
    }
}
