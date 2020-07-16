public class Students20Lab05 {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAge() {
            return this.age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String[] arr = scanner.nextLine().split("\\s+");
        while (!arr[0].equals("end")) {
            String firstName = arr[0];
            String lastName = arr[1];
            String age = arr[2];
            String town = arr[3];

            if (IsStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setTown(town);
            } else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }
            arr = scanner.nextLine().split("\\s+");
        }
        String town = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (town.equals(student.getTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}








/*
import java.util.*;

public class Students20Lab05 {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        Student(String firstName,String lastName, String age,String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students= new ArrayList<>();
        String[] arr = scanner.nextLine().split("\\s+");

        while (!arr[0].equals("end")) {
            String firstName = arr[0];
            String lastName = arr[1];
            String age = arr[2];
            String town = arr[3];

            if(IsStudentExisting(students, firstName,lastName)){
                Student student = getStudent(students,firstName,lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setTown(town);
            }else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }

            arr = scanner.nextLine().split("\\s+");
        }
        String town = scanner.nextLine();
        //printing
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (town.equals(student.getTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    } // main

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName){
        for(Student student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    private static Student getStudent(List<Student> students,String firstName,String lastName){
        Student existingStudent = null;
        for(Student student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}

 */