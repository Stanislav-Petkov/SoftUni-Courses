import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbs = Arrays.stream(scanner.nextLine().split("\\|")).mapToInt(Integer::parseInt).toArray();
        String line = scanner.nextLine();
        int startIndex = 0;
        int length = 0;
        int searchedNum = 0;
        while (!line.equals("Game Over")) {
            String[] commands = line.split("@");
            String actionType = commands[0];
            switch (actionType) {
                case "Reverse":
                    int last = numbs.length;
                    for (int i = 0; i < last / 2; i++) {
                        int first = numbs[0 + i];
                        int temp = first;
                        int posledno = numbs[last - 1 - i];
                        numbs[0 + i] = posledno;
                        numbs[last - 1 - i] = temp;
                    }
                    break;
            }
        }
        line = scanner.nextLine();
    }
}
