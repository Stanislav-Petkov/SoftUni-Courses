
import java.util.Scanner;

public class TextFilter04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] bannedWords = input.split(", ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            String bannedWordReplacement = repeat("*", bannedWord.length());
            while (text.contains(bannedWord)) {
                text = text.replace(bannedWord, bannedWordReplacement);
            }
        }
        System.out.println(text);
    }

    private static String repeat(String sign, int bannedWordLength) {
        String[] replacementString = new String[bannedWordLength];
        for (int i = 0; i < bannedWordLength; i++) {
            replacementString[i] = sign;
        }
        return String.join("", replacementString);
    }
}
