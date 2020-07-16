package dependencyInversion.data;

import dependencyInversion.busines.Employee;
import dependencyInversion.busines.EmployeeDataSource;

public class MySQLEmployeeDataSource implements EmployeeDataSource {
    @Override
    public Employee getOneById(long id) {
        //connect to db
        //write sql
        //perform query
        //return result
        return null;
    }
}
