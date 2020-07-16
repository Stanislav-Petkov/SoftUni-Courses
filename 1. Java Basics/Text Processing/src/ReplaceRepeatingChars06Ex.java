import java.util.Scanner;

public class ReplaceRepeatingChars06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] currentLetter = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentLetter.length; i++) {
            if (i == input.length() - 1) {
                sb.append(currentLetter[i]);
                break;
            }
            if (currentLetter[i] != currentLetter[i + 1]) {
                sb.append(currentLetter[i]);
            }
        }
        System.out.println(sb);
    }
}
