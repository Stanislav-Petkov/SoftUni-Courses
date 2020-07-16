package squareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        try {
            getSqrt(n);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Good bye");
        }
    }

    static void getSqrt(int n) {
        double sqrt = Math.sqrt(n);
        if (Double.isNaN(sqrt)) { // ako e nevalidno chislo
            throw new IllegalArgumentException("Invalid number");
        }
        System.out.println(sqrt);
    }
}
