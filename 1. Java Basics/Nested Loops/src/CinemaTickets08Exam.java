import java.util.Scanner;

public class CinemaTickets08Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCnt = 0;
        int kidCnt = 0;
        int standardCnt = 0;
        String filmName = scanner.nextLine();
        while (!"Finish".equals(filmName)) {
            int hallCapacity = Integer.parseInt(scanner.nextLine());
            int currentPlaceTaken = 0;
            for (int place = 0; place < hallCapacity; place++) {
                String ticketType = scanner.nextLine();
                if ("End".equals(ticketType)) {
                    break;
                }
                currentPlaceTaken++;
                switch (ticketType) {
                    case "student":
                        studentCnt++;
                        break;
                    case "standard":
                        standardCnt++;
                        break;
                    case "kid":
                        kidCnt++;
                        break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", filmName, currentPlaceTaken * 1.0 / hallCapacity * 100);
            filmName = scanner.nextLine();
        }
        int totalTickets = standardCnt + studentCnt + kidCnt;
        System.out.printf("Total tickets: %d %n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCnt * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCnt * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCnt * 1.0 / totalTickets * 100);
    }
}
