import java.util.Scanner;

public class PassedOrFailed3Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (n > 2.99) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
