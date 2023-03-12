package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.service.Service;

public interface EmployeeRepository extends Service {
    void add(Employee employee);
    void edit();
}
