package case_study.service.employee;

import case_study.model.person.Employee;
import case_study.service.Service;

public interface EmployeeService extends Service {
    void add(Employee employee);
    void edit(String code, Employee employee);
}
