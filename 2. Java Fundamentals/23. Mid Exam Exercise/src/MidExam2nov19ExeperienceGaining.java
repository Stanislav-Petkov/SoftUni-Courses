import java.util.Scanner;

public class MidExam2nov19ExeperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededXp = Double.parseDouble(scanner.nextLine());
        int countOFBattles = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int counter = 0;
        for (int i = 1; i <= countOFBattles; i++) {
            double exPerBattle = Double.parseDouble(scanner.nextLine());
            if (sum < neededXp) {
                counter++;
            }
            if (i % 3 == 0) {
                sum = sum + (exPerBattle * 1.15);
            } else if (i % 5 == 0) {
                sum = sum + (exPerBattle * 0.9);
            } else {
                sum += exPerBattle;
            }
            if (sum >= neededXp) {
                break;
            }
        }
        double battleCount = counter;
        double neededExperience = neededXp - sum;
        if (sum >= neededXp) {
            System.out.printf("Player successfully collected his needed experience for %.0f battles.", battleCount);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience);
        }
    }
}
