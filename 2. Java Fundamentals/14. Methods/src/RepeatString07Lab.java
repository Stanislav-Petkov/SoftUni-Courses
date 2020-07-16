import java.util.Scanner;

public class RepeatString07Lab {

    static String returnString(String letter, int counter) {
        String[] result = new String[counter];
        for (int i = 0; i < result.length; i++) {
            result[i] = letter;
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());
        String result = returnString(letters, counter);
        System.out.println(result);
    }
}
