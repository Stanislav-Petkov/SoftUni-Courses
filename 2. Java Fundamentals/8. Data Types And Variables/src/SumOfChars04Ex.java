import java.util.Scanner;

public class SumOfChars04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            char ch = scanner.next().charAt(0);
            sum += (int) ch;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}