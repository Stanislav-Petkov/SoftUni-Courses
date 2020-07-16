import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        BigInteger f = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(f);
    }
}
