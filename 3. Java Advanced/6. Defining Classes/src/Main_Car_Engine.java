public class Main_Car_Engine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engineMap = new HashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine;
            if (tokens.length == 2) {
                engine = new Engine(model, power);
            } else if (tokens.length == 4) {
                engine = new Engine(model, power, Integer.parseInt(tokens[2]), tokens[3]);
            } else {
                try {
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException ex) {
                    engine = new Engine(model, power, tokens[2]);
                }
            }
            engineMap.put(model, engine);
        }

        List<Car> cars = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car;
            String model = tokens[0];
            String engineName = tokens[1];
            Engine engine = engineMap.get(engineName);
            if (tokens.length == 2) {
                car = new Car(model, engine);
            } else if (tokens.length == 4) {
                car = new Car(model, engine, Integer.parseInt(tokens[2]), tokens[3]);
            } else {
                try {
                    int weight = Integer.parseInt(tokens[2]);
                    car = new Car(model, engine, weight);
                } catch (NumberFormatException ex) {
                    car = new Car(model, engine, tokens[2]);
                }
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

