import java.util.Scanner;

public class ReverseStrings01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.equals("end")) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(word + " = " + reverse);
            word = scanner.nextLine();
        }
    }
}
