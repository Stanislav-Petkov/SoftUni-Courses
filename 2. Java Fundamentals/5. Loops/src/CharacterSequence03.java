import java.util.Scanner;

public class CharacterSequence03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char result = text.charAt(i);
            System.out.println(result);
        }
    }
}
