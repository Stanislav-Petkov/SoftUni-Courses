import java.math.BigDecimal;
import java.util.Scanner;

class ExactSumofRealNumbers03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal num = new BigDecimal(scanner.next());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}