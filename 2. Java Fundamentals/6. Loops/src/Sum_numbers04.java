
import java.util.Scanner;

public class Sum_numbers04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scan.nextLine());
            sum += numbers;
        }
        System.out.println(sum);
    }
}