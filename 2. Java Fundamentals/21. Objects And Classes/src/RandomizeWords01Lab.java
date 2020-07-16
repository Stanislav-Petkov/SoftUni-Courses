import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01Lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String temp = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = temp;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
