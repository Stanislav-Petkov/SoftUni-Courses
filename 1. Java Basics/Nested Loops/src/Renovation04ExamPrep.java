import java.util.Scanner;

public class Renovation04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        String liters = scanner.nextLine();
        double LLiters = 0;
        double area = height * width * 4;
        double zaBoq = area - ((area * percent) / 100);
        while (!liters.equals("Tired!") || zaBoq <= 0) {
            LLiters = Double.parseDouble("" + liters);
            zaBoq = zaBoq - LLiters;
            if (zaBoq <= 0) {
                break;
            }
            liters = scanner.nextLine();
        }
        if (zaBoq > 0 && liters.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", zaBoq);
        }
        if (zaBoq < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(zaBoq));
        }
        if (zaBoq == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}








