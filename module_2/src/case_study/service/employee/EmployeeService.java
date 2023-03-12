package case_study.service.employee;

import case_study.model.person.Employee;
import case_study.service.Service;

public interface EmployeeService extends Service {
    void edit();
    void add(Employee employee);
}
