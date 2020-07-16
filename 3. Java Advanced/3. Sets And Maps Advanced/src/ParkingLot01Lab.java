import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        Set<String> cars = new LinkedHashSet<>();
        while (!"END".equals(line[0])) {
            String direction = line[0];
            String carNumber = line[1];
            if (direction.equals("IN")) {
                cars.add(carNumber);
            } else if (direction.equals("OUT")) {
                if (cars.contains(carNumber)) {
                    cars.remove(carNumber);
                }
            }

            line = scanner.nextLine().split(", ");
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        } else {
            for (String s : cars) {
                System.out.println(s);
            }
        }
    }
}
