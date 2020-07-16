import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        int n = readN(new Scanner("5"));
        for (int i = 1; i <= n; i++) {
            printSingleLineOfStars(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printSingleLineOfStars(n, i);
        }
    }

    private static void printSingleLineOfStars(int totalNumberOfStars, int starsToPrint) {
        int leadingSpaces = totalNumberOfStars - starsToPrint;
        for (int i = 0; i < leadingSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starsToPrint; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static int readN(Scanner scanner) {
        return scanner.nextInt();
    }
}
