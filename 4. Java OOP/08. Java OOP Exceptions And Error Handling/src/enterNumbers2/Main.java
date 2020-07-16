package enterNumbers2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        printAndReadInRange();
    }

    private static void printAndReadInRange() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        while (true) {
            try {
                validateRange(start, end);
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                start = scanner.nextInt();
                end = scanner.nextInt();
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    private static void validateRange(int start, int end) {
        if (start < 1 || start >= end || end > 100) {
            throw new IllegalArgumentException("Range must be between 1 and 100, your input : "
                    + start + " " + end + "\r\n" + "Please enter two new numbers in the specified range\r\n");
        }
    }
}
