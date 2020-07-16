import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth1000_21_13 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        String format = "dd-MM-yy";
        LocalDate d = LocalDate.parse(birthday, DateTimeFormatter.ofPattern(format)).plusDays(999);
        String day = String.valueOf(d.getDayOfMonth());
        if (Double.valueOf(day) < 10) {
            day = "0" + day;
        }
        String month = String.valueOf(d.getMonthValue());
        if (Double.valueOf(month) < 10) {
            month = "0" + month;
        }
        String year = String.valueOf(d.getYear());
        System.out.printf("%s-%s-%s", day, month, year);
    }
}