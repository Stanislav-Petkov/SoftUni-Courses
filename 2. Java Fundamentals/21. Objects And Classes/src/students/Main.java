package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }

        public Double getGrade() {
            return this.grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            double grade = Double.parseDouble(parts[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        students.stream().sorted((p1, p2) -> Double.compare(p2.getGrade(), p1.getGrade()))
                .forEach(e -> System.out.println(e));
    }
}
