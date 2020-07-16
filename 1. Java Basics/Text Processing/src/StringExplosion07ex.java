import java.util.Scanner;

public class StringExplosion07ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputAsChars = input.toCharArray();
        int currentPower = 0;
        String result = "";
        boolean isPunch = false;
        for (int i = 0; i < inputAsChars.length; i++) {
            if (inputAsChars[i] == '>') {
                isPunch = true;
                continue;
            }
            if (isPunch) {
                currentPower += inputAsChars[i] - 48;
                isPunch = false;
            }
            if (currentPower > 0) {
                inputAsChars[i] = '0';
                currentPower--;
            }
        }
        for (char ch : inputAsChars) {
            if (ch != '0') {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
