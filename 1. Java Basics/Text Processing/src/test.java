import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(toNumber(s));
        int num = Integer.parseInt(toNumber(s));
        System.out.println(num);
    }

    static String toNumber(String s) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numbers.append(s.charAt(i));
            }
        }
        return numbers.toString();
    }

    static String repeat(String s, int repeatCount) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            repeated.append(s);
            repeated.append(s);
        }
        repeated.replace(3, 5, "hip");
        return repeated.toString();
    }
}