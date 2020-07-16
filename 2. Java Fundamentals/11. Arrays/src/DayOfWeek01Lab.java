import java.util.Scanner;

public class DayOfWeek01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days[] = new String[]{"Monday",
                "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday"};
        int input = scanner.nextInt();
        if (input >= 1 && input <= 7) {
            System.out.println(days[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
