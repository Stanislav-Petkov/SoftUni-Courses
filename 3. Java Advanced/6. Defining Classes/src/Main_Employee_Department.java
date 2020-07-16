public class Main_Employee_Department {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departament = tokens[3];

            Employee employee;
            if (tokens.length == 4) {
                employee = new Employee(name, salary, position, departament);
            } else if (tokens.length == 6) {
                employee = new Employee(name, salary, position, departament,
                        tokens[4], Integer.parseInt(tokens[5]));
            } else {
                try {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, departament, age);
                } catch (NumberFormatException e) {
                    employee = new Employee(name, salary, position, departament, tokens[4]);
                }
            }
            departments.putIfAbsent(departament, new Department(departament));
            departments.get(departament).getEmployees().add(employee);
        }
        Department maxDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(f -> f.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxDepartment.getName());

        maxDepartment.getEmployees()
                .stream()
                .sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(System.out::println);
    }
}

