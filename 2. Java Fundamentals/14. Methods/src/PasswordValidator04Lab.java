import java.util.Scanner;

public class PasswordValidator04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int digitCounter = 0;
        boolean consistsOfDigits = false;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if ((digit >= 48 && digit <= 57)) {
                digitCounter++;
            }
        }

        boolean consistsOfLetter = false;
        boolean consistOfDifferent = false;
        int letterConter = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57)) {
                letterConter++;
                if (letterConter >= 4) {
                    consistsOfLetter = true;
                }
                if (digitCounter >= 2) {
                    consistsOfDigits = true;
                }
            } else {
                consistOfDifferent = true;
            }
        }
        int length = 0;
        if ((input.length() >= 6) && (input.length() <= 10)) {
            length = input.length();
        }
        if (digitCounter >= 2 && (length >= 6 && length <= 10) &&
                consistsOfLetter && consistsOfDigits) {
            System.out.println("Password is valid");
        }
        if ((input.length() < 6) || (input.length() > 10)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (consistOfDifferent) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (consistsOfDigits == false) {
            System.out.println("Password must have at least 2 digits");
        }
    }
}