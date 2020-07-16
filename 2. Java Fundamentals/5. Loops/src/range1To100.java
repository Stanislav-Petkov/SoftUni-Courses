import java.util.Scanner;

public class range1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 100 || n < 1) {
            System.out.println("Invalid number!");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", n);
    }
}
