import java.util.Scanner;

public class GreaterofTwoValues09Lab {

    static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    static char getMax(char a, char b) {
        if ((int) a > (int) b) {
            return a;
        } else {
            return b;
        }
    }

    static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("int")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.print(getMax(a, b));
        } else if (input.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.print(getMax(a, b));
        } else if (input.equals("String")) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.print(getMax(a, b));
        }
    }
}
