import java.util.Scanner;

public class Cinema04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String comingPeople = scanner.nextLine();
        double peopleCnt = 0;
        double income = 0;
        double currentPrice = 0;
        double currentPeople = 0;
        boolean isFull = false;
        double test = 0;
        while (!comingPeople.equals("Movie time!")) {
            peopleCnt = Double.parseDouble("" + comingPeople);
            if (peopleCnt % 3 == 0) {
                currentPrice = currentPrice + ((peopleCnt * 5) - 5);
            } else {
                currentPrice = currentPrice + peopleCnt * 5;
            }
            currentPeople = currentPeople + peopleCnt;
            comingPeople = scanner.nextLine();
            if (!comingPeople.equals("Movie time!")) {
                test = Double.parseDouble("" + comingPeople);
            }
            if (currentPeople + test > capacity) {
                isFull = true;
                if (!comingPeople.equals("Movie time!")) {
                    comingPeople = scanner.nextLine();
                }
                break;
            }
        }
        if (comingPeople.equals("Movie time!")) {
            System.out.printf("There are %.0f seats left in the cinema.%n", capacity - currentPeople);
        }
        if (isFull && !comingPeople.equals("Movie time!")) {
            System.out.printf("The cinema is full.%n");
        }
        System.out.printf("Cinema income - %.0f lv.", currentPrice);
    }
}