import java.util.Scanner;

public class StudentInformation1Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double grade = scanner.nextDouble();
        System.out.printf("Name %s, Age: %d, Grade: %.2f%n", name, age, grade);
    }
}
