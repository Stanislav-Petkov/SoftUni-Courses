import java.util.Scanner;

public class VowelsSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;
        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a') {
                sum = sum + 1;
            } else if (letter == 'e') {
                sum = sum + 2;
            } else if (letter == 'i') {
                sum = sum + 3;
            } else if (letter == 'o') {
                sum = sum + 4;
            } else if (letter == 'u') {
                sum = sum + 5;
            }
        }
        System.out.println(sum);
    }
}

