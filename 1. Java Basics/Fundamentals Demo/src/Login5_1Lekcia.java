import java.util.Scanner;

public class Login5_1Lekcia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String username = scanner.nextLine();
        String password = "";
        String confirmPassword = scanner.nextLine();
        boolean isBlocked = false;
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        while (!password.equals(confirmPassword)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            confirmPassword = scanner.nextLine();
        }
        if (!isBlocked) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
