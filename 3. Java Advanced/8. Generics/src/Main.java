import peopleNames.Car;
import peopleNames.CarList;

public class Main {
    public static void main(String[] args) {
        CarList<Car> carList = new CarList<>();
        Car car = new Car();

        carList.addCar(car);
        System.out.println(carList.getFastestCar());
    }
}
