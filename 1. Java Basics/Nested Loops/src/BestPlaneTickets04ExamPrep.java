import java.util.Scanner;

public class BestPlaneTickets04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        String minTicket = "";
        int min = Integer.MAX_VALUE;
        int mm = 0;
        int h = 0;
        while (!ticketNumber.equals("End")) {
            if (minutes < min) {
                min = minutes;
                minTicket = ticketNumber;
            }
            h = 0;
            mm = 0;
            if (min - 320 >= 0) {
                h = 5;
                mm = min - 320;
            } else if (min - 240 >= 0) {
                h = 4;
                mm = min - 240;
            } else if (min - 180 >= 0) {
                h = 3;
                mm = min - 180;
            } else if (min - 120 >= 0) {
                h = 2;
                mm = min - 120;
            } else if (min - 60 >= 0) {
                h = 1;
                mm = min - 60;
            }
            ticketNumber = scanner.nextLine();
            if (ticketNumber.equals("End")) {
                break;
            }
            price = Integer.parseInt(scanner.nextLine());
            minutes = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Ticket found for flight %s" +
                " costs %.2f leva with %dh %dm stay%n", minTicket, 1.96 * price, h, mm);
    }
}
