package dependencyInversion.busines;

import dependencyInversion.ui.EmployeeInfoService;

public class EmployeeInfoProvider implements EmployeeInfoService {
    private EmployeeDataSource dataSource;

    public EmployeeInfoProvider(EmployeeDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String fetchEmployeeNameById(long id) {
        Employee employee = dataSource.getOneById(id);
        return employee.getName();
    }
}
