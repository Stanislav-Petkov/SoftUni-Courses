package inheritance;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name);
        Student student = new Student("Bob");
        System.out.println(student.name);
    }
}
