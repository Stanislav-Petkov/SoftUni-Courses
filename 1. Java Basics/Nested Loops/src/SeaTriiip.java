import java.util.Scanner;

public class SeaTriiip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hrana = Double.parseDouble(scanner.nextLine());
        double suvenir = Double.parseDouble(scanner.nextLine());
        double hotel = Double.parseDouble(scanner.nextLine());
        double litraBenzin = 420.0 / 100 * 7;
        double parizaBenzin = litraBenzin * 1.85;
        double hranaISuveniri = 3 * hrana + 3 * suvenir;
        double purviDen = hotel * 0.9;
        double vtoriDen = hotel * 0.85;
        double tretiDen = hotel * 0.8;
        double totalMoney = parizaBenzin + hranaISuveniri + purviDen + vtoriDen + tretiDen;
        System.out.printf("Money needed: %.2f",totalMoney);
    }
}
