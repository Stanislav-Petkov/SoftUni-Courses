import java.util.List;
import java.util.Scanner;

public class Messaging01MoreExercise {

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] numbersList1 = scanner.nextLine().split(" ");
        for (int i = 0; i < numbersList1.length; i++) {
            numbers.add(Integer.parseInt(numbersList1[i]));
        }
        String words = scanner.nextLine();
        String shortSequence = "";
        int sum = 0; // 9+9+9+2
        int curr = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int indexValue = numbers.get(i);
            while (indexValue >= 0) {
                if (indexValue == 0) {
                    break;
                }
                curr = indexValue % 10;
                sum += curr;
                indexValue = indexValue / 10;
            }
            if (sum > words.length()) {
                int subtract = sum % words.length();
                shortSequence += words.charAt(subtract);
                String oldChar = Character.toString(words.charAt(subtract));
                words = words.replace(oldChar, "");
            } else {
                shortSequence += words.charAt(sum);
                words = removeCharAt(words, sum);
            }
            sum = 0;
        }
        System.out.println(shortSequence);
    }
}