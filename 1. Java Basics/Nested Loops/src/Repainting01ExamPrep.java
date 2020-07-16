import java.util.Scanner;

public class Repainting01ExamPrep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nailon = Double.parseDouble(scanner.nextLine());
        double boq = Double.parseDouble(scanner.nextLine());
        double razreditel = Double.parseDouble(scanner.nextLine());
        double chacsove = Double.parseDouble(scanner.nextLine());
        double needeNailon = (nailon + 2.0) * 1.5;
        double needeBoq = (boq + (boq * 0.1)) * 14.5;
        double neededRazreditel = razreditel * 5.0;
        double sum = needeNailon + needeBoq + neededRazreditel + 0.4; //213
        double maistor = (0.3 * sum) * chacsove; //513
        double fina = maistor + sum;
        System.out.printf("Total expenses: %.2f lv.", fina);
    }
}

