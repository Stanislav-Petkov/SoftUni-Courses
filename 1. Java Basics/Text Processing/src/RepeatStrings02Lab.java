import java.util.Scanner;

public class RepeatStrings02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String[] repeated = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            repeated[i] = repeat(word, word.length());
        }
        System.out.println(String.join("", repeated));
    }

    static String repeat(String s, int repeatCount) {
        String[] copies = new String[repeatCount];
        for (int i = 0; i < copies.length; i++) {
            copies[i] = s;
        }
        return String.join("", copies);
    }
}