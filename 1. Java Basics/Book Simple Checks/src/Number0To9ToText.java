import java.util.Scanner;

public class Number0To9ToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else if (a == 3) {
            System.out.println("three");
        } else if (a == 4) {
            System.out.println("four");
        } else if (a == 5) {
            System.out.println("five");
        } else if (a == 6) {
            System.out.println("six");
        } else if (a == 7) {
            System.out.println("seven");
        } else if (a == 8) {
            System.out.println("eight");
        } else if (a == 9) {
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }
    }
}
