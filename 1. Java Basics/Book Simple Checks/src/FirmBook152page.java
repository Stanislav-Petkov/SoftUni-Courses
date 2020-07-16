import java.util.Scanner;

public class FirmBook152page {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int projectHours = 90;
        int availableDays = 7;
        int workers = 3;
        double workDays = availableDays * 0.9;
        double overtimeHours = workers * availableDays * 2;
        double workHours = workDays * workers * 8;
        double totalHours = Math.floor(overtimeHours + workHours);
        if (projectHours > totalHours) {
            System.out.printf("Yes!%.0f hours left.", (workHours - totalHours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", workHours - totalHours);
        }
    }
}