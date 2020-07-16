import java.util.Scanner;

public class Volleyball12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfYear = scanner.nextLine();
        double holidaysNotSaturdayAndSunday = Double.parseDouble(scanner.nextLine());
        double weekendInHomeTown = Double.parseDouble(scanner.nextLine());
        double totalPlayDays = 0;
        double totalPlayDaysLeap = 0;
        if ("normal".equals(typeOfYear)) {
            totalPlayDays = ((((48 - weekendInHomeTown) * 3.0 / 4.0)) + (holidaysNotSaturdayAndSunday * 2.0 / 3.0))
                    + weekendInHomeTown;
            System.out.println(Math.floor(totalPlayDays));

        } else if ("leap".equals(typeOfYear)) {
            totalPlayDaysLeap = ((((48 - weekendInHomeTown) * 3.0 / 4.0)) + (holidaysNotSaturdayAndSunday * 2.0 / 3.0))
                    + weekendInHomeTown +
                    (((((48 - weekendInHomeTown) * 3.0 / 4.0)) + (holidaysNotSaturdayAndSunday * 2.0 / 3.0))
                            + weekendInHomeTown) * 0.15;
            System.out.println(Math.floor(totalPlayDaysLeap));
        }
    }
}
