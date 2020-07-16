import java.util.Scanner;

public class AExam05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broiGosti = Double.parseDouble(scanner.nextLine());
        double broiPodaruci = Double.parseDouble(scanner.nextLine());
        double counter = 1;
        double aCounter = 0;
        double bCounter = 0;
        double vCounter = 0;
        double gCounter = 0;
        String kategoria = "";
        for (int i = 1; i <= broiPodaruci; i++) {
            kategoria = scanner.nextLine();

            if (kategoria.equals("A")) {
                aCounter++;
            } else if (kategoria.equals("B")) {
                bCounter++;
            } else if (kategoria.equals("V")) {
                vCounter++;
            } else if (kategoria.equals("G")) {
                gCounter++;
            }
            counter++;
        }
        System.out.printf("%.2f%%%n", (aCounter / broiPodaruci) * 100);
        System.out.printf("%.2f%%%n", (bCounter / broiPodaruci) * 100);
        System.out.printf("%.2f%%%n", (vCounter / broiPodaruci) * 100);
        System.out.printf("%.2f%%%n", (gCounter / broiPodaruci) * 100);
        System.out.printf("%.2f%%%n", (broiPodaruci / broiGosti) * 100);
    }
}
