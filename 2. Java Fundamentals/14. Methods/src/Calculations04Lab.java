import java.util.Scanner;

public class Calculations04Lab {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("add")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            add(a, b);
        } else if (input.equals("multiply")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            multiply(a, b);
        } else if (input.equals("subtract")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            subtract(a, b);
        } else if (input.equals("divide")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            divide(a, b);
        }
    }
}
