import java.util.Scanner;

public class BakingCompetition06Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double playersCnt = Double.parseDouble(scanner.nextLine());
        String namePlayer = "";
        String sweetName = "";
        double sweetsCnt = 0;
        double cookiesCnt = 0;
        double cakesCnt = 0;
        double wafflesCnt = 0;
        double sumTotal = 0;
        double charity = 0;
        for (int i = 0; i < playersCnt; i++) {
            namePlayer = scanner.nextLine();
            sweetName = scanner.nextLine();
            sweetsCnt = Double.parseDouble(scanner.nextLine());
            while (!sweetName.equals("Stop baking!")) {
                if (sweetName.equals("cookies")) {
                    cookiesCnt = 0;
                    cookiesCnt = sweetsCnt;
                } else if (sweetName.equals("cakes")) {
                    cakesCnt = 0;
                    cakesCnt = sweetsCnt;
                } else if (sweetName.equals("waffles")) {
                    wafflesCnt = 0;
                    wafflesCnt = sweetsCnt;
                }
                sweetName = scanner.nextLine();
                if (sweetName.equals("Stop baking!")) {
                    break;
                }
                sweetsCnt = Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("%s baked %.0f cookies, %.0f cakes and %.0f waffles.%n"
                    , namePlayer, cookiesCnt, cakesCnt, wafflesCnt);
            sumTotal = sumTotal + cookiesCnt + cakesCnt + wafflesCnt;
            charity = charity + cookiesCnt * 1.5 + cakesCnt * 7.8 + wafflesCnt * 2.3;
            cakesCnt = 0;
            wafflesCnt = 0;
            cookiesCnt = 0;
        }
        System.out.printf("All bakery sold: %.0f%n", sumTotal);
        System.out.printf("Total sum for charity: %.2f lv.", charity);
    }
}
