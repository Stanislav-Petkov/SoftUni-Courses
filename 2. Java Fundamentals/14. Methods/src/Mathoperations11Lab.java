import java.text.DecimalFormat;
import java.util.Scanner;

public class Mathoperations11Lab {

    static double mathOperations(int firstNum, String sign, int secondNum) {
        double result = 0;
        if (sign.equals("*")) {
            result = firstNum * secondNum;
        } else if (sign.equals("/")) {
            result = firstNum * 1.0 / secondNum;
        } else if (sign.equals("+")) {
            result = firstNum + secondNum;
        } else if (sign.equals("-")) {
            result = firstNum - secondNum;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String sign = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = mathOperations(firstNum, sign, secondNum);
        System.out.println(new DecimalFormat("0.##").format(result));
    }
}
