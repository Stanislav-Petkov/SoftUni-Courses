import java.util.Scanner;

public class MaxNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int num = 0;
        int max = Integer.MIN_VALUE;
        while (count < n) {
            num = Integer.parseInt(scanner.nextLine());
            if (num > max) {
                max = num;
            }
            count++;
        }
        System.out.println(max);
    }
}
