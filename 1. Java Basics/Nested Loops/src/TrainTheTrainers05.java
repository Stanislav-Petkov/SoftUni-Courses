
import java.util.Scanner;

public class TrainTheTrainers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int judges = Integer.parseInt(scanner.nextLine());
        double totalSumGrade = 0;
        int gradeCount = 0;
        while (true) {
            double currentPresSumGrade = 0;
            String presentationName = scanner.nextLine();
            if (presentationName.equals("Finish")) {
                break;
            }
            for (int i = 1; i <= judges; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPresSumGrade += grade;
                totalSumGrade += grade;
                gradeCount++;
            }
            double avg = currentPresSumGrade / judges;
            System.out.printf("%s - %.2f.%n", presentationName, avg);
        }
        double totalAvg = totalSumGrade / gradeCount;
        System.out.printf("Student's final assessment is %.2f.", totalAvg);
    }
}