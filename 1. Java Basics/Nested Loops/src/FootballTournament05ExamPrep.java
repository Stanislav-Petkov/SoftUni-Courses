import java.util.Scanner;

public class FootballTournament05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double playedGames = Double.parseDouble(scanner.nextLine());
        if (playedGames == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
            return;
        }
        String letter = scanner.nextLine();
        double wCnt = 0;
        double dCnt = 0;
        double lCnt = 0;
        for (int i = 1; i <= playedGames; i++) {
            if (letter.equals("W")) {
                wCnt++;
            } else if (letter.equals("D")) {
                dCnt++;
            } else if (letter.equals("L")) {
                lCnt++;
            }
            if (letter.equals("0")) {
                System.out.printf("%s hasn't played any games during this season.", name);
                break;
            }
            if (i == playedGames) {
                break;
            }
            letter = scanner.nextLine();
        }
        System.out.printf("%s has won %.0f points during this season.%n", name, wCnt * 3 + dCnt * 1);
        System.out.println("Total stats:");
        System.out.printf("## W: %.0f%n", wCnt);
        System.out.printf("## D: %.0f%n", dCnt);
        System.out.printf("## L: %.0f%n", lCnt);
        System.out.printf("Win rate: %.2f%%", (wCnt / (wCnt + dCnt + lCnt)) * 100);
    }
}