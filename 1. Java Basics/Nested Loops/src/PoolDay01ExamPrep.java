import java.util.Scanner;

public class PoolDay01ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double shezlong = Double.parseDouble(scanner.nextLine());
        double chadur = Double.parseDouble(scanner.nextLine());
        double vhod = people * tax;
        double seventyFive = Math.ceil((0.75 * people)) * shezlong;
        double fiftyProcent = Math.ceil((0.5 * people)) * chadur;
        double final1 = vhod + seventyFive + fiftyProcent;
        System.out.printf("%.2f lv.", final1);
    }
}
