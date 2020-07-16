
import java.util.Scanner;

class CenturiestoMinutes09Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double years = n * 100;
        double days = Math.floor(years * 365.2422);
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes"
                , n, years, days, hours, minutes);
    }
}
