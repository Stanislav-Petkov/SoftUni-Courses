import java.util.Scanner;

public class Graduationpt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double grade = 0;
        int counter = 0;
        // double average = 0;
        double sum = 0;
        while (counter < 12) {
            grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                sum += grade;
            } else {
                // counter++;
                System.out.printf("%s has been excluded at %d grade", name, counter + 1);
                break;
            }
            counter++;
        }
        double average = sum / 12.0;
        if (average >= 4.00) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
