import java.util.Scanner;

public class ValidUsernames1Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String username : usernames) {
            if (validation(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean validation(String s) {
        boolean isValidLength = validLength(s);
        boolean isAllowedSymbol = true;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                isAllowedSymbol = false;
            }
        }
        return isAllowedSymbol && isValidLength;
    }

    public static boolean validLength(String s) {
        int length = s.length();
        if (length <= 16 && length >= 3) {
            return true;
        }
        return false;
    }
}
