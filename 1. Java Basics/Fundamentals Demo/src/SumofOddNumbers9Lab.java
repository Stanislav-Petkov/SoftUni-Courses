import java.util.Scanner;

public class SumofOddNumbers9Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        for (int j = 0; j < 2 * n; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
                sum += j;
                j++;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}