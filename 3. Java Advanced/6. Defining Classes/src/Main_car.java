import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car_1> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] carArr = scanner.nextLine().split("\\s+");
            if (carArr.length == 1) {
                Car_1 car = new Car_1(carArr[0]);
                carList.add(car);
            } else {
                Car_1 car = new Car_1(carArr[0], carArr[1], Integer.parseInt(carArr[2]));
                carList.add(car);
            }
        }
        for (int i = 0; i < carList.size(); i++) {
            Car_1 car = carList.get(i);
            System.out.println(car.carInfo());
        }
    }
}
