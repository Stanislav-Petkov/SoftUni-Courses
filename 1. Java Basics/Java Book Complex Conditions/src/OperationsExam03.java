import java.util.Scanner;

public class OperationsExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        if (n2 == 0) {
            System.out.println("Cannot divide " + n1 + " by zero");
            return;
        }
        if (operator.equals("+") || operator.equals("*") || operator.equals("-")) {
            int result = 0;
            if (operator.equals("+")) {
                result = n1 + n2;
            } else if (operator.equals("*")) {
                result = n1 * n2;
            } else {
                result = n1 - n2;
            }
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, result);
            }
        } else if (operator.equals("/")) {
            System.out.printf("%d / %d = %.2f", n1, operator, n2, n1 * 1.0 / n2);
        } else if (operator.equals("%")) {
            System.out.printf("%d %% %d = %d", n1, n2, n1 % n2);
        }
    }
}
