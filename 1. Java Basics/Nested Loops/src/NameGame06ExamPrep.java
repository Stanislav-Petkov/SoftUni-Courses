import java.util.Scanner;

public class NameGame06ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = 0;
        double IvanPoints = 0;
        double IvoPoints = 0;
        double max = -1;
        double currentPoints = 0;
        String maxName = "";
        while (!name.equals("Stop")) {
            for (int i = 0; i < name.length(); i++) {
                int num = Integer.parseInt(scanner.nextLine());

                if (name.charAt(i) == (int) num) {
                    currentPoints = currentPoints + points + 10.0;
                } else {
                    currentPoints = currentPoints + points + 2.0;
                }
            }
            if (currentPoints >= IvanPoints) {
                IvanPoints = currentPoints;
                maxName = name;
            } else {
                IvoPoints = currentPoints;
            }
            currentPoints = 0;
            points = 0;
            name = scanner.nextLine();
        }
        double result = 0;
        String winnerName = "";
        if (IvanPoints > IvoPoints) {
            result = IvanPoints;
            winnerName = "Ivan";
        } else {
            result = IvoPoints;
            winnerName = "Ivo";
        }
        System.out.printf("The winner is %s with %.0f points!", maxName, result);
    }
}
