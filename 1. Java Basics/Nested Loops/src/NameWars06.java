import java.util.Scanner;

public class NameWars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentName = scanner.nextLine();
        int bextNamePoints = 0;
        String bextName = "";
        while (!currentName.equals("STOP")) {
            int currentNamePoints = 0;
            for (int i = 0; i < currentName.length(); i++) {
                currentNamePoints += currentName.charAt(i);
            }
            if (currentNamePoints > bextNamePoints) {
                bextNamePoints = currentNamePoints;
                bextName = currentName;
            }
            currentName = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", bextName, bextNamePoints);
    }
}
