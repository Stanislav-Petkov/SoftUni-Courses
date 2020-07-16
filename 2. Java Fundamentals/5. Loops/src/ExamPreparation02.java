import java.util.Scanner;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPoorGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();
        // int grade = 0;
        int numberOfProblems = 0;
        String lastProblem = "";
        int gradeSum = 0;
        double lowgrade = 0;
        int poorGrades = 0;
        boolean isFailed = false;
        while (!taskName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradeSum = gradeSum + grade;
            numberOfProblems++;
            lastProblem = taskName;
            if (grade <= 4) {
                //lowgrade = lowgrade + grade;
                poorGrades++;
            }
            if (poorGrades == numberOfPoorGrades) {
                System.out.printf("You need a break, %s poor grades.", numberOfPoorGrades);
                isFailed = true;
                break;
            }
            taskName = scanner.nextLine();
        }
        double avgGrade = 0;
        if (numberOfPoorGrades == 0) {
            avgGrade = 0;
        } else {
            avgGrade = gradeSum * 1.0 / numberOfProblems;
        }
        if (!isFailed) {
            System.out.printf("Average score: %.2f%n", avgGrade);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
