import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        int meters = Integer.parseInt(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());
        double time = meters * timeFor1Meter;
        double delay = (meters / 15) * 12.5;
        double totalTime = time + delay;
        if (recordInSeconds <= totalTime) {
            double differenceInTimes = totalTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", differenceInTimes);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
