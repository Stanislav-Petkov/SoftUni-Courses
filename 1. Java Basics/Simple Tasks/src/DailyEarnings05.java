import java.util.Scanner;

public class DailyEarnings05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workingDays = Integer.parseInt(scanner.nextLine());
        double dollarPerDay = Double.parseDouble(scanner.nextLine());
        double exchangeRateDollarToLev = Double.parseDouble(scanner.nextLine());
        double monthlyEarning = workingDays * dollarPerDay;
        double grossYearlyEarnings = (monthlyEarning * 12) + (monthlyEarning * 2.5);
        double taxInDollars = 0.25 * grossYearlyEarnings;
        double netYearlyEarningsdollar = grossYearlyEarnings - taxInDollars;
        double netYearlyEarningsLeva = netYearlyEarningsdollar * exchangeRateDollarToLev;
        double dailyEarningLeva = netYearlyEarningsLeva / 365;
        System.out.printf("%.2f", dailyEarningLeva);
    }
}
