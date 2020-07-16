import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int minrsult = 0;
        if (minute > 59) {
            hour = hour + 1;
            minute = minute - 60;
            minrsult = (minute - 60) + 15;
        }
        if (hour > 23) {
            hour = hour - 1;
            minute = minute + 60;
        }
        System.out.printf("%d:%02d", hour, minrsult);
    }
}
