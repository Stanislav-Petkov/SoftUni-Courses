import java.util.Scanner;

public class Bus05Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double passangers = Double.parseDouble(scanner.nextLine());
        double busStops = Double.parseDouble(scanner.nextLine());
        double slizashti = Double.parseDouble(scanner.nextLine());
        double kachvashti = Double.parseDouble(scanner.nextLine());
        double proverqvasht = 2;
        double endStop = busStops * 2;
        for (int i = 1; i <= busStops; i++) {
            if (i % 2 == 0) {
                passangers = passangers - slizashti + kachvashti - proverqvasht;
            } else {
                passangers = passangers - slizashti + kachvashti + proverqvasht;
            }
            if (i == busStops) {
                break;
            }
            slizashti = Double.parseDouble(scanner.nextLine());
            kachvashti = Double.parseDouble(scanner.nextLine());
        }
        System.out.printf("The final number of passengers is : %.0f", passangers);
    }
}
