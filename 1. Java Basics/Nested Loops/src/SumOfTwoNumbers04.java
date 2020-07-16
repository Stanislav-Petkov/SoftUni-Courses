import java.util.Scanner;

public class SumOfTwoNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        for (int x1 = start; x1 <= ending; x1++) {
            for (int x2 = start; x2 <= ending; x2++) {
                counter++;
                int result = x1 + x2;
                if (n == result) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, x1, x2, result);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, n);
        }
    }
}
