package students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + ":" + this.grade;
    }

    public Double getGrade() {
        return this.grade;
    }
}
