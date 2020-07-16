import java.util.Scanner;

public class BeerKegs08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double max = -99999999999999999999999999999999.0;
        String name = "";
        double volume = 0;
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            volume = Math.PI * r * r * h;
            if (volume > max) {
                max = volume;
                name = model;
            }
        }
        System.out.println(name);
    }
}
