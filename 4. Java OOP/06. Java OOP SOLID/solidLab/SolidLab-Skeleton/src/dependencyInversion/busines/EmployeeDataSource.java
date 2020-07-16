package dependencyInversion.busines;

public interface EmployeeDataSource {
    Employee getOneById(long id);
}
