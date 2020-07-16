public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, SpeedRacing> cars = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);
            cars.put(model, new SpeedRacing(model, fuel, consumption));
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String model = tokens[1];
            int distance = Integer.parseInt(tokens[2]);
            if (!cars.get(model).drive(distance)) {
                System.out.println("Insufficient fuel for the drive");
            }
            line = scanner.nextLine();
        }
        for (SpeedRacing car : cars.values()) {
            System.out.println(car);
        }
    }
}
