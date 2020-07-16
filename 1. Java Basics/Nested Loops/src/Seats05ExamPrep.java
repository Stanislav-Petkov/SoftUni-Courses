import java.util.Scanner;

public class Seats05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        String final1 = "";
        if (ticket.length() == 4) {
            for (int i = 0; i < 1; i++) {
                if (ticket.charAt(i) >= 'A' && ticket.charAt(i) <= 'Z') {
                    for (int j = 0; j < ticket.length() - 1; j++) {
                        final1 += "" + ticket.charAt(j);
                    }
                }
            }
            for (int i = 0; i < ticket.length(); i++) {
                if (ticket.charAt(i) <= 'A' && ticket.charAt(i) >= 'Z') {
                    final1 = "" + ticket.charAt(3);
                    final1 = final1 + "" + ticket.charAt(1);
                    final1 = final1 + "" + ticket.charAt(2);
                }
            }
            System.out.println(final1);
        }
    }
}
