import java.util.Scanner;

public class MultiplyTable06Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int num = 0;
        n = Integer.parseInt(scanner.nextLine());
        while (n != 0) {
            num = num * 10;
            num = num + n % 10;
            n = n / 10;
        }
        int num1 = num % 10;
        int num2 = num / 10 % 10;
        int num3 = num / 100 % 10;
        for (int i = 1; i <= num3; i++) {
            for (int j = 1; j <= num2; j++) {
                for (int k = 1; k <= num1; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
