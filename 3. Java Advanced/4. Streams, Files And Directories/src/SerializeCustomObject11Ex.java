import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SerializeCustomObject11Ex {
    public static class Student implements Serializable {
        private String course;
        private int studentsCount;

        Student(String course, int studentsCount){
            this.course = course;
            this.studentsCount = studentsCount;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String course = "Java";
        int studentsCount = 100;
        Student student = new Student(course,studentsCount);

        Socket socket = new Socket("localhost",21);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(student);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectSer.ser"));
        Student student1 = (Student) objectInputStream.readObject();
        System.out.println(student1.course);
        System.out.println(student1.studentsCount);
    }
}
