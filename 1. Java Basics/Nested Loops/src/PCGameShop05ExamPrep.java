
import java.util.Scanner;

public class PCGameShop05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soldGame = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double counterHearthstone = 0;
        double counterFornite = 0;
        double counterOverwatch = 0;
        double counterOthers = 0;
        double counterAll = 0;
        double resultOthers = 0;
        double ostatukResult = 0;
        double resultPravilniIgri = 0;
        for (int i = 1; i <= soldGame; i++) {
            if (name.equals("Hearthstone")) {
                counterHearthstone++;
            } else if (name.equals("Fornite")) {
                counterFornite++;
            } else if (name.equals("Overwatch")) {
                counterOverwatch++;
            } else if (!name.equals("Hearthstone") || !name.equals("Fornite") || !name.equals("Overwatch")) {
                counterOthers++;
            }
            counterAll++;
            if (i == soldGame) {
                break;
            }
            name = scanner.nextLine();
        }
        resultPravilniIgri = 100.0 - ((counterOthers / counterAll) * 100);
        resultOthers = 100.0 - resultPravilniIgri;
        if (counterHearthstone > 0) {
            if (counterFornite == 0 && counterOverwatch == 0) {
                System.out.printf("Hearthstone - %.2f%%%n", resultPravilniIgri);
            } else {
                System.out.printf("Hearthstone - %.2f%%%n", resultPravilniIgri / (counterAll - counterOthers));
            }
        } else {
            System.out.printf("Hearthstone - %.2f%%%n", 0.0);
        }
        if (counterFornite > 0) {
            if (counterOverwatch == 0 && counterHearthstone == 0) {
                System.out.printf("Fornite - %.2f%%%n", resultPravilniIgri);
            } else {
                System.out.printf("Fornite - %.2f%%%n", resultPravilniIgri / (counterAll - counterOthers));
            }
        } else {
            System.out.printf("Fornite - %.2f%%%n", 0.0);
        }
        if (counterOverwatch > 0) {
            if (counterFornite == 0 && counterHearthstone == 0) {
                System.out.printf("Overwatch - %.2f%%%n", resultPravilniIgri);
            } else {
                System.out.printf("Overwatch - %.2f%%%n", resultPravilniIgri / (counterAll - counterOthers));
            }
        } else {
            System.out.printf("Overwatch - %.2f%%%n", 0.0);
        }
        if (counterOthers > 0) {
            System.out.printf("Others - %.2f%%%n", resultOthers);
        } else {
            System.out.printf("Others - %.2f%%%n", 0.0);
        }
    }
}
