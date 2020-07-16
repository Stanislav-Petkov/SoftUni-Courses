import java.util.Scanner;

public class SignofIntegerNumbers01Lab {

    static void number(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.print("The number 0 is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        number(scanner.nextInt());
    }
}