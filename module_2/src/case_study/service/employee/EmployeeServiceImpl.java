package case_study.service.employee;

import case_study.model.person.Employee;
import case_study.repository.employee.EmployeeRepository;
import case_study.repository.employee.EmployeeRepositoryImpl;


public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeRepository repository = new EmployeeRepositoryImpl();

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Employee employee) {
        repository.add(employee);
    }

    @Override
    public void edit(String code, Employee employee) {
        repository.edit(code, employee);
    }
}
