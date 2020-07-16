import java.util.Scanner;

public class FamilyTrip02ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double nigthCnt = Double.parseDouble(scanner.nextLine());
        double nighttPrice = Double.parseDouble(scanner.nextLine());
        double extraExpense = Double.parseDouble(scanner.nextLine());
        double nightSumPrice = 0;
        if (nigthCnt > 7) {
            nightSumPrice = (nigthCnt * nighttPrice) - (0.05 * nighttPrice * nigthCnt);
        } else {
            nightSumPrice = (nigthCnt * nighttPrice);
        }
        double ExtraSum = extraExpense / 100.0 * budget;
        if ((nightSumPrice + ExtraSum) <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",
                    budget - (nightSumPrice + ExtraSum));
        } else {
            System.out.printf("%.2f leva needed.", (nightSumPrice + ExtraSum) - budget);
        }
    }
}
