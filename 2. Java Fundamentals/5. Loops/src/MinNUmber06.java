
import java.util.Scanner;

public class MinNUmber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int min = Integer.MAX_VALUE;
        int num = 0;
        while (count < n) {
            num = Integer.parseInt(scanner.nextLine());
            count++;
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
