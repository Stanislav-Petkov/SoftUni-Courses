import java.util.Scanner;

public class SeriesCalculator01ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sezon = Double.parseDouble(scanner.nextLine());
        double epizodi = Double.parseDouble(scanner.nextLine());
        double vremetraene = Double.parseDouble(scanner.nextLine());
        double reklama = 0.2 * vremetraene;
        double sreklama = reklama + vremetraene;
        double extraTime = sezon * 10;
        double totalTime = Math.floor(sreklama * epizodi * sezon + extraTime);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, totalTime);
    }
}
