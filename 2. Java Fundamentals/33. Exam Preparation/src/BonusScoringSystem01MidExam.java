import java.util.Scanner;

public class BonusScoringSystem01MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        double countLectures = Double.parseDouble(scanner.nextLine());
        double initialBonus = Double.parseDouble(scanner.nextLine());
        double totalBonus = 0;
        double max = Double.MIN_VALUE;
        double maxLectures = 0;
        double attendance = 0;
        for (int i = 0; i < countStudents; i++) {
            if (initialBonus >= 0 && initialBonus <= 100 && countStudents >= 0 && countStudents <= 50
                    && countLectures >= 0 && countLectures <= 50) {
                attendance = Double.parseDouble(scanner.nextLine());
                totalBonus = attendance / countLectures * (5 + initialBonus);
                if (totalBonus >= max) {
                    max = totalBonus;
                    maxLectures = attendance;
                }
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(max));
        System.out.printf("The student has attended %.0f lectures.", maxLectures);
    }
}
