import java.util.Scanner;

public class OnTimeForTheExamExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());
        String late = "Late";
        String onTime = "On time";
        String early = "Early";
        int examTime = (examHours * 60) + examMinutes;
        int arrivalTime = (arrivalHours * 60) + arrivalMinutes;
        int totalMinutesDifference = arrivalTime - examTime;
        String studentArrival = late;
        if (totalMinutesDifference < -30) {
            studentArrival = early;
        } else if (totalMinutesDifference <= 0) {
            studentArrival = onTime;
        }
        String result = "";
        if (totalMinutesDifference != 0) {
            int hoursDifference = Math.abs(totalMinutesDifference / 60);
            int minutesDifference = Math.abs(totalMinutesDifference % 60);
            if (hoursDifference > 0) {
                result = String.format("%d:%02d hours", hoursDifference, minutesDifference);
            } else {
                result = minutesDifference + " minutes";
            }
            if (totalMinutesDifference < 0) {
                result += " before the start";
            } else {
                result += " after the start";
            }
        }
    }
}