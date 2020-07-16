
import java.util.Scanner;

class PoundstoDollars02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.printf("%.3f",n*1.31);
    }
}