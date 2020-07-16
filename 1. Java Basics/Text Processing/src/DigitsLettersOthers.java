import java.util.Scanner;

public class DigitsLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stDigits = new StringBuilder();
        StringBuilder stLetters = new StringBuilder();
        StringBuilder stOters = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                stDigits.append(s.charAt(i));
            } else if (Character.isAlphabetic(s.charAt(i))) {
                stLetters.append(s.charAt(i));
            } else {
                stOters.append(s.charAt(i));
            }
        }
        System.out.println(stDigits);
        System.out.println(stLetters);
        System.out.println(stOters);
    }
}
