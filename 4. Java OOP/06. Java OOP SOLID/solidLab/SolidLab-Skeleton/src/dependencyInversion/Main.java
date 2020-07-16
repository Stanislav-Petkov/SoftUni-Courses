package dependencyInversion;

import dependencyInversion.busines.*;
import dependencyInversion.data.InMemoryEmployeeDataSource;
import dependencyInversion.ui.ConsoleClient;
import dependencyInversion.ui.EmployeeInfoService;
import dependencyInversion.ui.Formatter;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //business interface      data source layer impl
        EmployeeDataSource dataSource = new InMemoryEmployeeDataSource();

        //ui interface           business layer impl
        Formatter formatter = new PrettyCurrentTimeAppendingFormatter(DateTimeFormatter.ISO_TIME);
        //Formatter formatter = new CurrentTimeAppendingFormatter();

        //class from ui
        EmployeeInfoService employeeInfoService = new EmployeeInfoProvider(dataSource);
        ConsoleClient consoleClient = new ConsoleClient(
                employeeInfoService, formatter);

        consoleClient.printInfoFor(1);
    }
}
