package dependencyInversion.data;

import dependencyInversion.busines.Employee;
import dependencyInversion.busines.EmployeeDataSource;

import java.util.Map;

public class InMemoryEmployeeDataSource implements EmployeeDataSource {
    private static final Map<Long, Employee> STUB_DATA_SOURCE =
            Map.of(
                    1L, new Employee("Alice", "Sofia"),
                    2L, new Employee("Bob", "Plovdiv"),
                    3L, new Employee("Charlie", "Varna")
            );

    @Override
    public Employee getOneById(long id) {
        return STUB_DATA_SOURCE.get(id);
    }
}













