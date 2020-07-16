import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        System.out.println("Enter two integers:");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Math.max(a, b);
        System.out.println(max);
    }
}
