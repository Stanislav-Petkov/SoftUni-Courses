
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean isFound = false;
        while (!isFound) {
            a = Integer.parseInt(scanner.nextLine());
            if (b == a) {
                isFound = true;
                System.out.print("Yes");
            } else {
                System.out.print(a);
            }
        }
    }
}
