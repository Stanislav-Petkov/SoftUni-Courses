import java.util.Scanner;

public class MultiplicationTable2011Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = m; i == m || i < 11; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
    }
}
