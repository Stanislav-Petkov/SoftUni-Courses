import java.util.Scanner;

public class NumberPyramid01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int n = Integer.parseInt(scanner.nextLine());
        flag:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
                if (counter > n) {
                    break flag;
                }
            }
            System.out.println();
        }
    }
}