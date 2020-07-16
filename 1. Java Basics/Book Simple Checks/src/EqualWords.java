import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        if (str1.equals(str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}