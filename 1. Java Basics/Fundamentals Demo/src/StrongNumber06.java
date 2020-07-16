import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum += fact;
        }
        int num = 1;
        if (sum == Integer.parseInt(input))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
