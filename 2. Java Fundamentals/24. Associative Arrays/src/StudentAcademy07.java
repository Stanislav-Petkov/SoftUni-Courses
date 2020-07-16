
public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!students.containsKey(name)) {
                students.put(name, new LinkedList<>());
                students.get(name).add(grade);
            } else {
                if (!students.get(name).contains(grade)) {
                    students.get(name).add(grade);
                }
            }
        }
        Map<String, Double> average = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (averageGrade >= 4.5) {
                average.put(entry.getKey(), averageGrade);
            }
        }
        average.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue())));
    }
}
