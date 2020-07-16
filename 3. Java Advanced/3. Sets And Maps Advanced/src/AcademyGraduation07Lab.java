import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation07Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            String[] arr = scanner.nextLine().split("\\s+");
            Double[] grade = new Double[arr.length];
            for (int j = 0; j < arr.length; j++) {
                grade[j] = Double.parseDouble(arr[j]);
            }
            map.put(name, grade);
        }
        for (Map.Entry<String, Double[]> entry : map.entrySet()) {
            Double[] arr = entry.getValue();
            double size = 0;
            for (int i = 0; i < arr.length; i++) {
                size += arr[i];
            }
            Double average = size / arr.length;
            System.out.println(entry.getKey() + " is graduated with " + average);
        }
    }
}
