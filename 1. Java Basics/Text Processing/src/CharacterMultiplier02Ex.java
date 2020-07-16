import java.util.Scanner;

public class CharacterMultiplier02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        String first = values[0];
        String second = values[1];
        String smallest = "";
        String longest = "";
        if (first.length() >= second.length()) {
            smallest = second;
            longest = first;
        } else {
            smallest = first;
            longest = second;
        }
        int sum = 0;
        boolean isEmpty1 = false;
        boolean isEmpty2 = false;
        int counter = 0;
        for (int i = 0; i < smallest.length(); i++) {
            char symbol1 = first.charAt(i);
            char symbol2 = second.charAt(i);
            sum += (symbol1 * symbol2);
            counter++;
        }
        for (int i = counter; i < longest.length(); i++) {
            char symbol1 = longest.charAt(i);
            sum += symbol1;
        }
        System.out.println(sum);
    }
}
