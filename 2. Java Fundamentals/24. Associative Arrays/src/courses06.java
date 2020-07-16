
public class courses06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> course = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];
            if (!course.containsKey(courseName)) {
                course.put(courseName, new LinkedList<>());
                course.get(courseName).add(studentName);
            } else {
                if (!course.get(courseName).contains(studentName)) {
                    course.get(courseName).add(studentName);
                }
            }
            input = scanner.nextLine();
        }
        course.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry
                            .getValue()
                            .stream()
                            .sorted((a, b) -> a.compareTo(b))
                            .forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
