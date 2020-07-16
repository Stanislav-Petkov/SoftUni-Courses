import java.util.Scanner;

public class CruiseGames05PrepExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        double games = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        double sumPoints = 0;
        double vCnt = 0;
        double vPoints = 0;
        double tCnt = 0;
        double tPoints = 0;
        double bCnt = 0;
        double bPoints = 0;
        for (int i = 1; i <= games; i++) {
            if (gameName.equals("volleyball")) {
                vPoints = vPoints + points + 0.07 * points;
                vCnt++;
            } else if (gameName.equals("tennis")) {
                tPoints = tPoints + points + 0.05 * points;
                tCnt++;
            } else if (gameName.equals("badminton")) {
                bPoints = bPoints + points + 0.02 * points;
                bCnt++;
            }
            sumPoints = vPoints + tPoints + bPoints;
            if (i == games) {
                break;
            }
            gameName = scanner.nextLine();
            points = 0;
            points = Double.parseDouble(scanner.nextLine());
        }
        if ((vPoints / vCnt >= 75) && (tPoints / tCnt >= 75) && (bPoints / bCnt >= 75)) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", playerName, sumPoints);
        } else {
            System.out.printf("Sorry, %s, you lost. " +
                    "Your points are only %.0f.", playerName, sumPoints);
        }
    }
}
