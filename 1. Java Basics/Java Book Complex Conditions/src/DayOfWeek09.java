import java.util.Scanner;

public class DayOfWeek09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String day1 = "0";
        switch (day) {
            case 1:
                day1 = "Monday";
                break;
            case 2:
                day1 = "Tuesday";
                break;
            case 3:
                day1 = "Wednesday";
                break;
            case 4:
                day1 = "Thursday";
                break;
            case 5:
                day1 = "Friday";
                break;
            case 6:
                day1 = "Saturday";
                break;
            case 7:
                day1 = "Sunday";
                break;
            default:
                day1 = "error";
                break;
        }
        System.out.println(day1);
    }
}