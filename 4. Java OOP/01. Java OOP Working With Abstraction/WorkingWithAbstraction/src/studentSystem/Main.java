package studentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem(new InMemoryStudentRepository());
        StudentSystemInputParser parser = new StudentSystemInputParser();
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            switch (command) {
                case "Exit":
                    return;
                case "Create":
                    Student student = parser.createStudent(input);
                    studentSystem.persistUniqueStudent(student);
                    break;
                case "Show":
                    printStudentInfo(studentSystem.studentInformationFor(input[1]));
                    break;
            }
        }
    }

    private static void printStudentInfo(String output1) {
        String output = output1;
        if (output != null) {
            System.out.println(output);
        }
    }
}