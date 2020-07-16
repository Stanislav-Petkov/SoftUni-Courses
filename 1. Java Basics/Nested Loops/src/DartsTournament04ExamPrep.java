import java.util.Scanner;

public class DartsTournament04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double startPoints = Double.parseDouble(scanner.nextLine());
        String sector = scanner.nextLine();
        double currentPoints = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        while (!sector.equals("bullseye") || startPoints == 0) {
            counter++;
            if (sector.equals("number section")) {
                currentPoints = 1 * currentPoints;
                startPoints = startPoints - currentPoints;
            } else if (sector.equals("double ring")) {
                currentPoints = currentPoints * 2;
                startPoints = startPoints - currentPoints;
            } else if (sector.equals("triple ring")) {
                currentPoints = currentPoints * 3;
                startPoints = startPoints - currentPoints;
            }
            if (startPoints < 0) {
                System.out.printf("Sorry, you lost. Score " +
                        "difference: %.0f.", Math.abs(startPoints));
                break;
            }
            if (startPoints == 0) {
                System.out.printf("Congratulations! You won " +
                        "the game in %d moves!", counter);
                break;
            }
            currentPoints = 0;
            sector = scanner.nextLine();
            if (sector.equals("bullseye")) {
                counter++;
                System.out.printf("Congratulations! You won the game" +
                        " with a bullseye in %d moves!", counter);
                break;
            }
            currentPoints = Double.parseDouble(scanner.nextLine());
        }
    }
}
