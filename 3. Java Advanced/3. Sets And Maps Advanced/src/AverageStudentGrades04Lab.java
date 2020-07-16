import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentGrades04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> nameMap = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            String line = scanner.nextLine();
            String[] arr = line.split("\\s+");
            String name = arr[0];
            double currentGrade = Double.parseDouble(arr[1]);
            ArrayList<Double> newGradeList = new ArrayList<Double>();
            newGradeList.add(currentGrade);
            if (!nameMap.containsKey(name)) {
                nameMap.put(name, newGradeList);
            } else {
                ArrayList<Double> currentGradeList = nameMap.get(name);
                currentGradeList.add(currentGrade);
                nameMap.put(name, currentGradeList);
            }
        }
        for (Map.Entry<String, ArrayList<Double>> entry : nameMap.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            ArrayList<Double> values = new ArrayList<>(entry.getValue());
            int counter = 0;
            double sum = 0;
            for (int i = 0; i < values.size(); i++) {
                System.out.printf("%.02f ", values.get(i));
                counter++;
                sum += values.get(i);
            }
            System.out.printf("(avg: %.2f)%n", sum / counter);
        }
    }
}
