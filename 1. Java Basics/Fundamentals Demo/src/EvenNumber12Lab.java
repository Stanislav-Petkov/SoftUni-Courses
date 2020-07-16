import java.util.Scanner;

public class EvenNumber12Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isFound = true;
        while (isFound) {
            if (n % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(n));
                isFound = false;
            } else {
                System.out.println("Please write an even number.");
                n = scanner.nextInt();
            }
        }
    }
}
