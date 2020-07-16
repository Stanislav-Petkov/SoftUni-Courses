import java.util.Scanner;

public class MovieStars04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double zaplata = 0;
        double currentBudget = budget;
        while (currentBudget >= 0 && !name.equals("ACTION")) {
            if (name.length() <= 15) {
                zaplata = Double.parseDouble(scanner.nextLine());
                currentBudget = currentBudget - zaplata;
            } else {
                currentBudget = currentBudget - currentBudget * 0.2;
            }
            if (currentBudget <= 0) {
                break;
            }
            name = scanner.nextLine();
        }
        if (currentBudget <= 0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(currentBudget));
        } else {
            System.out.printf("We are left with %.2f leva.", currentBudget);
        }
    }
}
