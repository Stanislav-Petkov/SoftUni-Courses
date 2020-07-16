import java.util.Scanner;

public class SumSeconds3107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());
        int totalSec = firstTime + secondTime + thirdTime;
        int sec = 0;
        int min = 0;
        if (totalSec < 60) {
            sec = totalSec;
            if (sec < 10) {
                System.out.printf("%d:0%d", min, sec);
            } else {
                System.out.printf("%d:%d", min, sec);
            }
        } else if (totalSec < 120) {
            sec = totalSec - 60;
            min = 1;
            if (sec < 10) {
                System.out.printf("%d:0%d", min, sec);
            } else {
                System.out.printf("%d:%d", min, sec);
            }
        } else {
            sec = totalSec - 120;
            min = 2;
            if (sec < 10) {
                System.out.printf("%d:0%d", min, sec);
            } else {
                System.out.printf("%d:%d", min, sec);
            }
        }
    }
}
