import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08Lab {
    static double mathPower(double number, int power) {
        double sum = 1;
        for (int i = 1; i <= power; i++) {
            sum *= number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int power = scanner.nextInt();
        double result = mathPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
}
