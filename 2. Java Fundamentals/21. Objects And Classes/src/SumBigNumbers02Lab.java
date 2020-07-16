import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        BigInteger sum = n.add(b);
        System.out.println(sum);
    }
}
