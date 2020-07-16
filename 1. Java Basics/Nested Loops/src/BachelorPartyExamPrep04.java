import java.util.Scanner;

public class BachelorPartyExamPrep04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double singerPrice = Double.parseDouble(scanner.nextLine());
        String peopleInGroup = scanner.nextLine();
        double kuvert = 0;
        double sumKuvert = 0;
        double sumPeople = 0;
        while (!peopleInGroup.equals("The restaurant is full")) {
            double people = Double.parseDouble("" + peopleInGroup);
            if (people < 5) {
                kuvert = 100;
                kuvert = kuvert * people;
            } else {
                kuvert = 70;
                kuvert = kuvert * people;
            }
            sumKuvert = sumKuvert + kuvert;
            sumPeople = sumPeople + people;
            peopleInGroup = scanner.nextLine();
        }
        if (sumKuvert >= singerPrice) {
            System.out.printf("You have %.0f guests and %.0f leva left.", sumPeople, sumKuvert - singerPrice);
        } else {
            System.out.printf("You have %.0f guests and %.0f leva income, but no singer.", sumPeople, sumKuvert);
        }
    }
}
