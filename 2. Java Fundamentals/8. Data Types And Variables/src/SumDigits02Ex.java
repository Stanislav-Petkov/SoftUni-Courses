
import java.util.Scanner;

public class SumDigits02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        int cur = 0;
        for (int i = 0; i < n.length(); i++) {
            cur = cur + Integer.parseInt("" + n.charAt(i));
        }
        System.out.println(cur);
    }
}
