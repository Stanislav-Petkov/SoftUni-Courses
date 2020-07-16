import java.util.Scanner;

public class WorldSnookerChampionshipExamPrep03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        double ticketsCnt = Double.parseDouble(scanner.nextLine());
        String photo = scanner.nextLine();
        boolean hasTax = false;
        if (photo.equals("Y")) {
            hasTax = true;
        }
        double price = 0;
        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    price = 55.5;
                } else if (ticketType.equals("Premium")) {
                    price = 105.2;

                } else if (ticketType.equals("VIP")) {
                    price = 118.9;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    price = 75.88;
                } else if (ticketType.equals("Premium")) {
                    price = 125.22;
                } else if (ticketType.equals("VIP")) {
                    price = 300.4;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    price = 110.1;
                } else if (ticketType.equals("Premium")) {
                    price = 160.66;
                } else if (ticketType.equals("VIP")) {
                    price = 400;
                }
                break;
        }
        double totalPrice = price * ticketsCnt; // 5 * Final VIP - 400
        if (totalPrice > 4000) {
            totalPrice = totalPrice - totalPrice * 0.25; // total * 0.75
            hasTax = false;
        } else if (totalPrice > 2500) {
            totalPrice = totalPrice - totalPrice * 0.1;
        }
        if (hasTax) {
            totalPrice = totalPrice + (ticketsCnt * 40);
        }
        System.out.printf("%.2f", totalPrice);
    }
}