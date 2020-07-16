import java.util.Scanner;

public class MultiplicationTable10Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
    }
}
