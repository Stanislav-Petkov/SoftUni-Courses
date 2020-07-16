import java.util.Scanner;

public class OddEvenSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n=");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter numbers: ");
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                sum = sum + num;
            } else {
                sum2 = sum2 + num;

            }
        }
        if (sum == sum2) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - sum2));
        }
    }
}
