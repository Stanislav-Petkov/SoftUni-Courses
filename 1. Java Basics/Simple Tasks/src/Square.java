import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = a * a;
        System.out.println("Square = " + b);
    }
}
