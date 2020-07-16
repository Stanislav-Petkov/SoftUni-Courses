
public class MidExam6Aug19BlackFlag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        int counter = 1;
        double sum = 0;
        for (int i = 0; i < days; i++) {
            sum = sum + dailyPlunder;
            if (counter % 3 == 0) {
                sum = sum + (0.5 * dailyPlunder);
            }
            if (counter % 5 == 0) {
                sum = 0.7 * sum;
            }
            counter++;
        }
        if (sum >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            double percentage = (sum / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
