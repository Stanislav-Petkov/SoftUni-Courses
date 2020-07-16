import java.util.Scanner;

public class Snowballs11Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double max = -9999999999999999999999.0;
        double ss = 0;
        double st = 0;
        double sv = 0;
        double sq = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (snowballValue > max) {
                max = snowballValue;
                ss = snowballSnow;
                st = snowballTime;
                sv = snowballValue;
                sq = snowballQuality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", ss, st, sv, sq);
    }
}
