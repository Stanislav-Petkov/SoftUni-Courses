import java.util.Scanner;

public class Elevator03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) numOfPeople / capacity);
        System.out.print(courses);
    }
}
