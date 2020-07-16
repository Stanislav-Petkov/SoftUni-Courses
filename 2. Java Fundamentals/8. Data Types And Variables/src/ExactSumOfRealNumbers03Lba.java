import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers03Lba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigDecimal.valueOf(scanner.nextDouble()));
        }
        System.out.print(sum);
    }
}
